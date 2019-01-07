/*
rule = ExternalPackagesRename
 */
package test

import org.scalatest._
import org.scalatest.selenium.{WebBrowser, InternetExplorer}

class RenameInternetExplorerSpec extends FunSuite with WebBrowser with InternetExplorer {

  test("test example") {
    go to "https://www.artima.com"
    succeed
  }
}
