/*
rule = ExternalPackagesRename
 */
package test

import org.scalatest._
import org.scalatest.selenium.{WebBrowser, HtmlUnit}

class RenameHtmlUnitSpec extends FunSuite with WebBrowser with HtmlUnit {

  test("test example") {
    go to "https://www.artima.com"
    succeed
  }
}
