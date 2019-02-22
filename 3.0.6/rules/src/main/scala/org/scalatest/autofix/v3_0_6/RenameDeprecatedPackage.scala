package org.scalatest.autofix.v3_0_6

import metaconfig.Configured
import scalafix.v1._
import scala.meta._

class RenameDeprecatedPackage extends SemanticRule("RenameDeprecatedPackage") {

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
      "org.scalatest.junit.AssertionsForJUnit" -> "org.scalatestplus.junit.AssertionsForJUnit",
      "org.scalatest.junit.JUnit3Suite" -> "org.scalatestplus.junit.JUnit3Suite",
      "org.scalatest.junit.JUnitRunner" -> "org.scalatestplus.junit.JUnitRunner",
      "org.scalatest.junit.JUnitSuite" -> "org.scalatestplus.junit.JUnitSuite",
      "org.scalatest.junit.JUnitSuiteLike" -> "org.scalatestplus.junit.JUnitSuiteLike",
      "org.scalatest.junit.JUnitTestFailedError" -> "org.scalatestplus.junit.JUnitTestFailedError",
      "org.scalatest.junit.JUnitWrapperSuite" -> "org.scalatestplus.junit.JUnitWrapperSuite",
      "org.scalatest.testng.TestNGSuite" -> "org.scalatestplus.testng.TestNGSuite",
      "org.scalatest.testng.TestNGSuiteLike" -> "org.scalatestplus.testng.TestNGSuiteLike",
      "org.scalatest.testng.TestNGWrapperSuite" -> "org.scalatestplus.testng.TestNGWrapperSuite"
    )
  }

}
