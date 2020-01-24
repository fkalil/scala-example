package example

import scala.util.matching.Regex

object RegularExpressions {


  def main(args: Array[String]): Unit = {

    val numPattern = new Regex("[0-9]+")

    val address = "123 Main Street Suite 101"

    val match1 = numPattern.findAllMatchIn(address)

    match1.foreach(println)
  }

}
