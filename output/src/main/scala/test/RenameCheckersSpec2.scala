package test

import org.scalatest._
import org.scalatest.prop._
import org.scalatestplus.scalacheck.Checkers

class RenameCheckersSpec2 extends FunSuite with Checkers {
  
  test("test concat") {
    check((a: List[Int], b: List[Int]) => a.size + b.size == (a ::: b).size)
  }
}
