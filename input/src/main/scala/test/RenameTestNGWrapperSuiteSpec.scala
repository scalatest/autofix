/*
rule = ExternalPackagesRename
 */
package test

import org.scalatest._

class RenameTestNGWrapperSuiteSpec extends FunSuite {

  test("testing") {
    val s = new FunSuite
    val ngSuite = new org.scalatest.testng.TestNGWrapperSuite(List("suite.xml"))
  }

}