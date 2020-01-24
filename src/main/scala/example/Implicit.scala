package example

object Implicit {
implicit class StringImprovements(s: String) {
       def increment = s.map(c => (c + 1).toChar)
}

  def main(args: Array[String]) {
    println("HAL".increment)
  }
}