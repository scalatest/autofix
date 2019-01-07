/*
rule = ExternalPackagesRename
 */
package test

import org.scalatest._
import org.scalatest.prop.{Checkers, GeneratorDrivenPropertyChecks}

class RenameGeneratorDrivenPropertyChecksSpec3 extends FunSuite with GeneratorDrivenPropertyChecks with Matchers {

  test("testing") {
    forAll { (a: String) =>
      assert(a.length < 0)
    }
  }
}
