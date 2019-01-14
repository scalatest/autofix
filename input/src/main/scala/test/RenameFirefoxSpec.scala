/*
rule = ExternalPackagesRename
 */
package test

import org.scalatest._
import org.scalatest.selenium.{WebBrowser, Firefox}

class RenameFirefoxSpec extends FunSuite with WebBrowser with Firefox {

  test("test example") {
    go to "https://www.artima.com"
    succeed
  }
}
