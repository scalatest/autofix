/*
rule = ExternalPackagesRename
 */
package test

import org.scalatest._
import org.scalatest.jmock.{JMockExpectations, JMockCycleFixture}

class RenameJMockExpectationsSpec extends fixture.FunSuite with JMockCycleFixture {

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

      (new JMockExpectations).oneOf (oneFishMock).eat("red fish")
      (new JMockExpectations).oneOf (twoFishMock).eat("blue fish")
    }

    whenExecuting {
      oneFishMock.eat("red fish")
      twoFishMock.eat("green fish")
    }
  }
}
