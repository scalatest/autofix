package test

import org.scalatest._
import org.scalatest.prop._
import org.scalatestplus.scalacheck.ScalaCheckDrivenPropertyChecks

class RenameGeneratorDrivenPropertyChecksSpec2 extends FunSuite with ScalaCheckDrivenPropertyChecks with Matchers {

  test("testing") {
    forAll { (a: String) =>
      assert(a.length < 0)
    }
  }
}
