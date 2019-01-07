/*
rule = ExternalPackagesRename
 */
package test

import org.scalatest._

class RenameJUnitTestFailedErrorSpec extends FunSuite {

  test("testing") {
    val a = 1
    if (a == 1)
      succeed
    else
      throw new org.scalatest.junit.JUnitTestFailedError(
        None,
        None,
        Right(0),
        None
      )
  }

}