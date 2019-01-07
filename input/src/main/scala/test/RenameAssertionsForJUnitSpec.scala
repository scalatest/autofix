/*
rule = ExternalPackagesRename
 */
package test

import org.scalatest._
import org.scalatest.junit.AssertionsForJUnit

class RenameAssertionsForJUnitSpec extends FunSuite with AssertionsForJUnit {

  test("testing") {
    val a = 1
    assert(a == 1)
  }

}