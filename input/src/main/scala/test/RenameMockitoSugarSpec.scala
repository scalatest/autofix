/*
rule = ExternalPackagesRename
 */
package test

import org.scalatest._
import org.scalatest.mockito.MockitoSugar

class RenameMockitoSugarSpec extends FunSuite with MockitoSugar {

  test("test example") {
    trait OneFish {
      def eat(food: String): Unit = ()
    }
    trait TwoFish {
      def eat(food: String): Unit = ()
    }
    val oneFishMock = mock[OneFish]
    val twoFishMock = mock[TwoFish]

    succeed
  }
}
