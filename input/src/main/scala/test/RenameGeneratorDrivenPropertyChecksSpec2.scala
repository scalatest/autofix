/*
rule = ExternalPackagesRename
 */
package test

import org.scalatest._
import org.scalatest.prop._

class RenameGeneratorDrivenPropertyChecksSpec2 extends FunSuite with GeneratorDrivenPropertyChecks with Matchers {

  test("testing") {
    forAll { (a: String) =>
      assert(a.length < 0)
    }
  }
}
