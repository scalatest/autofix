/*
rule = ExternalPackagesRename
 */
package test

import org.scalatest._

class RenameJUnitRunnerSpec extends FunSuite {

  test("testing") {
    val suite = new FunSuite
    val runner = new org.scalatest.junit.JUnitRunner(suite.getClass)
  }

}