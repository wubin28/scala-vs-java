package scalaVsJava.recursiveVsLoop

import org.scalatest.FunSuite

/**
 * Created by twer on 5/16/15.
 */
class Recursive extends FunSuite{

  def firstScalaFileIndex(strings: Array[String]) = {
    def searchFrom(i: Int): Int = {
      if (i >= strings.length) -1
      else if (strings(i).startsWith("-")) searchFrom(i + 1)
      else if (strings(i).endsWith(".scala")) i
      else searchFrom(i + 1)
    }
    searchFrom(0)
  }

  test("in Scala recursive is over loop") {
    assert(1 === firstScalaFileIndex(Array("-xvz", "helloWorld.scala")))
  }
}
