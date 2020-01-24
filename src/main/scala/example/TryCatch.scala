package example

import java.io.{FileNotFoundException, FileReader, IOException}

object TryCatch {

  // Main method
  def main(args: Array[String])
  {

    // Try clause
    try
      {
        // Creating object for FileReader
        val t = new FileReader("input.txt")
      }

      // Catch clause
    catch
      {

        // Case statement-1
        case x: FileNotFoundException =>
        {
          // Displays this if the file is
          // missing
          println("Exception: File missing")

        }

        // Case statement-2
        case x: IOException   =>
        {

          // Displays this if input/output
          // exception is found
          println("Input/output Exception")

        }
      }
  }

}
