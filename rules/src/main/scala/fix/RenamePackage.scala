package fix

import metaconfig.Configured
import scalafix.v1._
import scala.meta._

class RenamePackage extends SemanticRule("RenamePackage") {

  override def fix(implicit doc: SemanticDocument): Patch = {
    Patch.replaceSymbols(
      "org.scalatest.prop.Checkers" -> "org.scalatestplus.scalacheck.Checkers",
      "org.scalatest.prop.PropertyChecks" -> "org.scalatestplus.scalacheck.ScalaCheckPropertyChecks",
      "org.scalatest.prop.GeneratorDrivenPropertyChecks" -> "org.scalatestplus.scalacheck.ScalaCheckDrivenPropertyChecks",
      "org.scalatest.easymock.EasyMockSugar" -> "org.scalatestplus.easymock.EasyMockSugar",
      "org.scalatest.jmock.AsyncJMockCycleFixture" -> "org.scalatestplus.jmock.AsyncJMockCycleFixture",
      "org.scalatest.jmock.JMockCycleFixture" -> "org.scalatestplus.jmock.JMockCycleFixture",
      "org.scalatest.jmock.JMockCycle" -> "org.scalatestplus.jmock.JMockCycle",
      "org.scalatest.jmock.JMockExpectations" -> "org.scalatestplus.jmock.JMockExpectations",
      "org.scalatest.mockito.MockitoSugar" -> "org.scalatestplus.mockito.MockitoSugar",
      "org.scalatest.selenium.Page" -> "org.scalatestplus.selenium.Page",
      "org.scalatest.selenium.WebBrowser" -> "org.scalatestplus.selenium.WebBrowser",
      "org.scalatest.selenium.HtmlUnit" -> "org.scalatestplus.selenium.HtmlUnit",
      "org.scalatest.selenium.Driver" -> "org.scalatestplus.selenium.Driver",
      "org.scalatest.selenium.Firefox" -> "org.scalatestplus.selenium.Firefox",
      "org.scalatest.selenium.Safari" -> "org.scalatestplus.selenium.Safari",
      "org.scalatest.selenium.Chrome" -> "org.scalatestplus.selenium.Chrome",
      "org.scalatest.selenium.InternetExplorer" -> "org.scalatestplus.selenium.InternetExplorer",
      "org.scalatest.junit.AssertionsForJUnit" -> "org.scalatestplus.junit.AssertionsForJUnit"
    )
  }

}
