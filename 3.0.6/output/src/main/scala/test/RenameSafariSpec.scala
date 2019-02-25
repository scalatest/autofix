package test

import org.scalatest._
import org.scalatestplus.selenium.{ Safari, WebBrowser }

class RenameSafariSpec extends FunSuite with WebBrowser with Safari {

  test("test example") {
    go to "https://www.artima.com"
    succeed
  }
}
