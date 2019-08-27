/*
 * Copyright 2001-2015 Artima, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.scalatest.examples.asyncfeaturespeclike

import org.scalatest._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext
import org.scalatest.featurespec.AsyncFeatureSpecLike

// Defining actor messages
case object IsOn
case object PressPowerButton

class TVSetActor { // Simulating an actor
  private var on: Boolean = false
  def !(msg: PressPowerButton.type): Unit =
    synchronized {
      on = !on
    }
  def ?(msg: IsOn.type)(implicit c: ExecutionContext): Future[Boolean] =
    Future {
      synchronized { on }
    }
}

class ReplaceAsyncFeatureSpecLike2 extends AsyncFeatureSpecLike with GivenWhenThen {

  implicit override def executionContext =
    scala.concurrent.ExecutionContext.Implicits.global

  info("As a TV set owner")
  info("I want to be able to turn the TV on and off")
  info("So I can watch TV when I want")
  info("And save energy when I'm not watching TV")

  Feature("TV power button") {
    Scenario("User presses power button when TV is off") {

      Given("a TV set that is switched off")
      val tvSetActor = new TVSetActor

      When("the power button is pressed")
      tvSetActor ! PressPowerButton

      Then("the TV should switch on")
      val futureBoolean = tvSetActor ? IsOn
      futureBoolean map { isOn => assert(isOn) }
    }

    Scenario("User presses power button when TV is on") {

      Given("a TV set that is switched on")
      val tvSetActor = new TVSetActor
      tvSetActor ! PressPowerButton

      When("the power button is pressed")
      tvSetActor ! PressPowerButton

      Then("the TV should switch off")
      val futureBoolean = tvSetActor ? IsOn
      futureBoolean map { isOn => assert(!isOn) }
    }
  }

  def testScenariosFor(): Unit = {
    Scenario("scenario 1") {
      succeed
    }

    Scenario("scenario 2") {
      succeed
    }
  }

  ScenariosFor(testScenariosFor())
}
