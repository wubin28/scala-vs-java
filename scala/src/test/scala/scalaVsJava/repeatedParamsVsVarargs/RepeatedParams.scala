package scalaVsJava.repeatedParamsVsVarargs

import org.scalatest.FunSuite

/**
 * Created by twer on 5/14/15.
 */
class RepeatedParams extends FunSuite{

  test("the type of the repeated parameter is an Array of the declared type of the parameter") {
    def echo(args: String*) = for(arg <- args) yield arg.toUpperCase
    val howAboutScala = echo("Scala", "really", "rocks")
    assert( "SCALA REALLY ROCKS" === howAboutScala.mkString(" "))
  }
}
