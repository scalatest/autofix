package test

import org.scalatest._
import org.scalatestplus.selenium.{ InternetExplorer, WebBrowser }

class RenameInternetExplorerSpec extends FunSuite with WebBrowser with InternetExplorer {

  test("test example") {
    go to "https://www.artima.com"
    succeed
  }
}
