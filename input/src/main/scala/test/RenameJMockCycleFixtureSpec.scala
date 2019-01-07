/*
rule = ExternalPackagesRename
 */
package test

import org.scalatest._
import org.scalatest.jmock.JMockCycleFixture

class RenameJMockCycleFixtureSpec extends fixture.FunSuite with JMockCycleFixture {

  test("test example") { cycle =>
    import cycle._
    trait OneFish {
      def eat(food: String): Unit = ()
    }
    trait TwoFish {
      def eat(food: String): Unit = ()
    }
    val oneFishMock = mock[OneFish]
    val twoFishMock = mock[TwoFish]

    expecting { e => import e.{oneOf => OneOf}

      OneOf (oneFishMock).eat("red fish")
      OneOf (twoFishMock).eat("blue fish")
    }

    whenExecuting {
      oneFishMock.eat("red fish")
      twoFishMock.eat("green fish")
    }
  }
}
