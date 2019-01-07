/*
rule = ExternalPackagesRename
 */
package test

import org.scalatest._

class RenameJUnitWrapperSuiteSpec extends FunSuite {

  test("testing") {
    val s = new FunSuite
    val juSuite = new org.scalatest.junit.JUnitWrapperSuite(s.getClass.getName, s.getClass.getClassLoader)
  }

}