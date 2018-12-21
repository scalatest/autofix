
package test

import org.scalatest._
import org.scalatest.check.Checkers

class RenameCheckersSpec extends FunSuite with Checkers {
  
  test("test concat") {
    check((a: List[Int], b: List[Int]) => a.size + b.size == (a ::: b).size)
  }
}
