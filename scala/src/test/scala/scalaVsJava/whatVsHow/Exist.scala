package scalaVsJava.whatVsHow

import org.scalatest.FunSuite

/**
 * Created by twer on 5/16/15.
 */
class Exist extends FunSuite{

  test("if a string has an upper case character") {
    val name = "Ben Wu"
    assert(true === name.exists(_.isUpper))
  }
}
