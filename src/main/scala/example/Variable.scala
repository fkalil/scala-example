package example

object Variable {

  def main(args: Array[String]) {
    var myVar :Int = 10
    val myVal :String = "Hello Scala with datatype declaration."
    var myVar1 = "Hello Scala new without datatype declaration."
    val myVal1 = 20
    val (v1, v2) = Pair(40, "Foo")

    myVar = myVar + 2
    //myVal1 = myVal1 +3

    println(myVar)
    println(myVal)
    println(myVar1)
    println(myVal1)
    println(v1)
    println(v2)
  }

}
