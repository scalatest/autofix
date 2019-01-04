package test

import org.scalatest._

class RenameTestNGWrapperSuiteSpec extends FunSuite {

  test("testing") {
    val s = new FunSuite
    val ngSuite = new org.scalatestplus.testng.TestNGWrapperSuite(List("suite.xml"))
  }

}