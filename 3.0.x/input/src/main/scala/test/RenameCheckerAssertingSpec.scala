/*
rule = RenameDeprecatedPackage
 */
package test

import org.scalatest._
import org.scalatest.enablers.CheckerAsserting

class RenameCheckerAssertingSpec extends FunSuite {

  class CustomCheckerAsserting extends CheckerAsserting[String] {
    def check(p: org.scalacheck.Prop, prms: org.scalacheck.Test.Parameters, prettifier: org.scalactic.Prettifier, pos: org.scalactic.source.Position, argNames: Option[List[String]]) = ???
  }

  test("test concat") {
    val a = new CustomCheckerAsserting
  }
}
