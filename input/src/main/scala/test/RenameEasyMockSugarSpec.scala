/*
rule = ExternalPackagesRename
 */
package test

import org.scalatest._
import org.scalatest.easymock.EasyMockSugar

class RenameEasyMockSugarSpec extends FunSuite with EasyMockSugar {

  test("test example") {
    trait OneFish {
      def eat(food: String): Unit = ()
    }
    trait TwoFish {
      def eat(food: String): Unit = ()
    }
    val oneFishMock = mock[OneFish]
    val twoFishMock = mock[TwoFish]

    expecting {
      oneFishMock.eat("red fish")
      twoFishMock.eat("blue fish")
    }

    // Trying the use case of passing an existing list of mocks for
    // the heck of it.
    val mocks = List(oneFishMock, twoFishMock)

    whenExecuting(mocks: _*) {
      oneFishMock.eat("red fish")
      twoFishMock.eat("green fish")
    }
  }
}
