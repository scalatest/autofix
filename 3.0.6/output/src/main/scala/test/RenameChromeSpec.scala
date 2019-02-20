package test

import org.scalatest._
import org.scalatestplus.selenium.{ Chrome, WebBrowser }

class RenameChromeSpec extends FunSuite with WebBrowser with Chrome {

  test("test example") {
    go to "https://www.artima.com"
    succeed
  }
}
