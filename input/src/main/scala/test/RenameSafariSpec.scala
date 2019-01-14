/*
rule = ExternalPackagesRename
 */
package test

import org.scalatest._
import org.scalatest.selenium.{WebBrowser, Safari}

class RenameSafariSpec extends FunSuite with WebBrowser with Safari {

  test("test example") {
    go to "https://www.artima.com"
    succeed
  }
}
