package example

object NullAlternatives {

  def toInt(in: String): Option[Int] = {
    try {
      Some(Integer.parseInt(in.trim))
    } catch {
      case e: NumberFormatException => None
    }
  }

  def main(args: Array[String]) {
    toInt("52") match {
      case Some(i) => println(i)
      case None => println("That didn't work.")
    }
    toInt("TEST") match {
      case Some(i) => println(i)
      case None => println("That didn't work.")
    }

    val bag = List("1", "2", "foo", "3", "bar")
    println(bag.flatMap(toInt).sum)
  }

}
