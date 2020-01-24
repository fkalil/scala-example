package example

object Functions {

  //Variable arguments
  def printAll(strings: String*) {
    strings.foreach(println)
  }

  //Default parameter
  def sum(x: Int = 2, y: Int = 2): Int = {
    x + y
  }

  //Named arguments
  def printName(name: String, age: Int) {
    println(name + " " + age)
  }


  // Nested Function
  def maxAndMin(a: Int, b: Int) = {

    // Nested Function
    def maxValue() = {
      if (a > b) {
        println("Max is: " + a)
      }
      else {
        println("Max is: " + b)
      }
    }

    // Nested Function
    def minValue() = {
      if (a < b) {
        println("Min is: " + a)
      }
      else {
        println("Min is: " + b)
      }
    }

    maxValue();
    minValue();
  }

  //High-order functions
  def applyDiscount(value:Double, calculateDiscountAmount: Double => Double): Double = {
      value-calculateDiscountAmount(value)
  }

  def simple (value:Double):Double ={
    value * 0.1
  }

  def double (value:Double):Double ={
    value * 0.2
  }

  //Anonymous functions
  def evenNumbers (): Unit = {
    val x = List.range(1, 10)
    val evens = x.filter((i: Int) => i % 2 == 0)
    evens.foreach(println)
  }

  // Currying function declaration
  def add2(a: Int) (b: Int) = a + b


  def main(args: Array[String]): Unit = {
    println("Variable arguments")

    printAll("foo", "bar", "bae")
    println()

    println("Fruits")
    val fruits = List("apple", "banana", "cherry")
    printAll(fruits: _*)

    println()

    println("Default parameter")
    println(sum())
    println(sum(3, 4))

    println()

    println("Named arguments")
    printName(age = 15, name = "Rose")

    println()

    println("Nested Function")
    maxAndMin(5, 7);

    println()

    println("High-order functions")
    println(applyDiscount(100,simple))
    println(applyDiscount(100,double))

    println()

    println("Anonymous functions")
    evenNumbers

    println()

    println("Currying function declaration")
    val result=add2(20)_
    println(result)
    println(result(5))
  }

}
