package test

import org.scalatest._
import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks

class RenamePropertyChecksSpec3 extends FunSuite with ScalaCheckPropertyChecks with Matchers {

  test("testing") {
    forAll { (a: String) =>
      assert(a.length < 0)
    }
  }
}
