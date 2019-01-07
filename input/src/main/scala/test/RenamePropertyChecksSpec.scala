/*
rule = ExternalPackagesRename
 */
package test

import org.scalatest._
import org.scalatest.prop.PropertyChecks

class RenamePropertyChecksSpec extends FunSuite with PropertyChecks with Matchers {

  test("testing") {
    forAll { (a: String) =>
      assert(a.length < 0)
    }
  }
}
