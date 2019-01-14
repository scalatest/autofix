/*
rule = ExternalPackagesRename
 */
package test

import org.scalatest._
import org.scalatest.selenium.{WebBrowser, Driver}

trait RenameDriverSpec extends FunSpecLike with concurrent.Eventually { this: WebBrowser with Driver =>
  describe("google.com") {

    it("should change its title based on the term searched") {
      // Cancel test when cannot access google.com
      try goTo("http://www.google.com") catch { case e: Throwable => cancel(e) }
      clickOn("q")
      textField("q").value = "Cheese!"
      submit()
      // Google's search is rendered dynamically with JavaScript.
      eventually(assert(pageTitle === "Cheese! - Google Search"))
      close()
    }

  }
}
