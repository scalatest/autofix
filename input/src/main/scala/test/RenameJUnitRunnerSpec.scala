/*
rule = RenamePackage
 */
package test

import org.scalatest._
import org.scalatest.junit.JUnitRunner

class RenameJUnitRunnerSpec extends FunSuite {

  test("testing") {
    val suite = new FunSuite
    val runner = new org.scalatest.junit.JUnitRunner(suite.getClass)
  }

}