object NumberCategorizer {

  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("Please provide exactly one integer as input.")
      System.exit(1)
    }

    val input = args(0).toInt

    // Define the lambda function for categorizing the number
    val categorizeNumber: Int => String = {
      case n if n % 3 == 0 && n % 5 == 0 => "Multiple of Both Three and Five"
      case n if n % 3 == 0 => "Multiple of Three"
      case n if n % 5 == 0 => "Multiple of Five"
      case _ => "Not a Multiple of Three or Five"
    }

    // Print the result of the categorization
    println(categorizeNumber(input))
  }
}
