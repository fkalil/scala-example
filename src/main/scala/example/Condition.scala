package example

object Condition {

  def main(args: Array[String]) {

    val x = 30

    // if
    if (x == 10) {
      println("Value of X is 10")
    } else if (x == 20) {
      println("Value of X is 20")
    } else if (x == 30) {
      println("Value of X is 30")
    } else {
      println("This is else statement")
    }

    //yield
    val a = Array(1, 2, 3, 4, 5)
    val b = for (e <- a if e > 2) yield e
    for (i <- b) println(i)

    //while
    var j = 5

    while (j > 0) {
      println("j is : " + j)
      j = j - 1
    }

  }


}
