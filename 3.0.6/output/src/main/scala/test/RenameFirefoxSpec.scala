package test

import org.scalatest._
import org.scalatestplus.selenium.{ Firefox, WebBrowser }

class RenameFirefoxSpec extends FunSuite with WebBrowser with Firefox {

  test("test example") {
    go to "https://www.artima.com"
    succeed
  }
}
