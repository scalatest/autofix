/*
rule = ExternalPackagesRename
 */
package test

import org.scalatest._
import org.scalatest.prop.{Checkers, PropertyChecks}

class RenamePropertyChecksSpec3 extends FunSuite with PropertyChecks with Matchers {

  test("testing") {
    forAll { (a: String) =>
      assert(a.length < 0)
    }
  }
}
