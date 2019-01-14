package test

import org.scalatest._
import org.scalatestplus.selenium.{ HtmlUnit, WebBrowser }

class RenameHtmlUnitSpec extends FunSuite with WebBrowser with HtmlUnit {

  test("test example") {
    go to "https://www.artima.com"
    succeed
  }
}
