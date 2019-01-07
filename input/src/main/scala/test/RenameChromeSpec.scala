/*
rule = ExternalPackagesRename
 */
package test

import org.scalatest._
import org.scalatest.selenium.{ WebBrowser, Chrome }

class RenameChromeSpec extends FunSuite with WebBrowser with Chrome {

  test("test example") {
    go to "https://www.artima.com"
    succeed
  }
}
