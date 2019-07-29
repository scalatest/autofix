/*
rule = RewriteDeprecatedNames
 */
/*
 * Copyright 2001-2013 Artima, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.scalatest.examples.pathfreespec

import org.scalatest.path
import org.scalatest.Matchers
import scala.collection.mutable.ListBuffer

class ReplacePathFreeSpec extends path.FreeSpec with Matchers {

  "A ListBuffer" - {

    val buf = ListBuffer.empty[Int] // This implements "A ListBuffer"

    "should be empty when created" in {

      // This test sees:
      //   val buf = ListBuffer.empty[Int]
      // So buf is: ListBuffer()

      buf should be (empty)
    }

    "when 1 is appended" - {

      buf += 1 // This implements "when 1 is appended", etc...

      "should contain 1" in {

        // This test sees:
        //   val buf = ListBuffer.empty[Int]
        //   buf += 1
        // So buf is: ListBuffer(1)

        buf.remove(0) should equal (1)
        buf should be (empty)
      }

      "when 2 is appended" - {

        buf += 2

        "should contain 1 and 2" in {

          // This test sees:
          //   val buf = ListBuffer.empty[Int]
          //   buf += 1
          //   buf += 2
          // So buf is: ListBuffer(1, 2)

          buf.remove(0) should equal (1)
          buf.remove(0) should equal (2)
          buf should be (empty)
        }

        "when 2 is removed" - {

          buf -= 2

          "should contain only 1 again" in {

            // This test sees:
            //   val buf = ListBuffer.empty[Int]
            //   buf += 1
            //   buf += 2
            //   buf -= 2
            // So buf is: ListBuffer(1)

            buf.remove(0) should equal (1)
            buf should be (empty)
          }
        }

        "when 3 is appended" - {

          buf += 3

          "should contain 1, 2, and 3" in {

            // This test sees:
            //   val buf = ListBuffer.empty[Int]
            //   buf += 1
            //   buf += 2
            //   buf += 3
            // So buf is: ListBuffer(1, 2, 3)

            buf.remove(0) should equal (1)
            buf.remove(0) should equal (2)
            buf.remove(0) should equal (3)
            buf should be (empty)
          }
        }
      }

      "when 88 is appended" - {

        buf += 88

        "should contain 1 and 88" in {

          // This test sees:
          //   val buf = ListBuffer.empty[Int]
          //   buf += 1
          //   buf += 88
          // So buf is: ListBuffer(1, 88)

          buf.remove(0) should equal (1)
          buf.remove(0) should equal (88)
          buf should be (empty)
        }
      }
    }

    "should have size 0 when created" in {

      // This test sees:
      //   val buf = ListBuffer.empty[Int]
      // So buf is: ListBuffer()

      buf should have size 0
    }
  }
}
