package scalaVsJava.constructor

import org.scalatest.FunSuite

/**
 * Created by twer on 5/16/15.
 */
class Constructor extends FunSuite{
  class FullName (firstName: String, lastName: String) {
    override def toString: String = firstName + " " + lastName
  }

  test("scala's constructor is concise") {
    val fullName = new FullName("Ben", "Wu")
    assert("Ben Wu" === fullName.toString)
  }
}
