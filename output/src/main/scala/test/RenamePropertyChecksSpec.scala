
package test

import org.scalatest._
import org.scalatest.check.ScalaCheckPropertyChecks

class RenamePropertyChecksSpec extends FunSuite with ScalaCheckPropertyChecks with Matchers {

  test("testing") {
    forAll { (a: String) =>
      assert(a.length < 0)
    }
  }
}
