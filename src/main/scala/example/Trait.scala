package example

object Trait {

  trait Pet {
    def speak { println("Yo") }   // concrete implementation of a speak method
    def comeToMaster              // abstract
  }

  class Dog extends Pet {
    // don't need to implement 'speak' if you don't want to
    def comeToMaster { println("I'm coming!") }
  }

  class Cat extends Pet {
    // override 'speak'
    override def speak { println("meow") }
    def comeToMaster { println("That's not gonna happen.") }
  }

  def main(args: Array[String]) {
    new Dog().speak
    new Cat().speak
    new Dog().comeToMaster
    new Cat().comeToMaster
  }

}
