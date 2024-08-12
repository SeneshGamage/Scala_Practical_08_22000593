import scala.io.StdIn.readLine

object NumberCategorizer {

  def main(args: Array[String]): Unit = {
    val input = if (args.length != 1) {
      println("Please provide exactly one integer as input:")
      readLine().toInt
    } else {
      args(0).toInt
    }

    val categorizeNumber: Int => String = {
      case n if n % 3 == 0 && n % 5 == 0 => "Multiple of Both Three and Five"
      case n if n % 3 == 0 => "Multiple of Three"
      case n if n % 5 == 0 => "Multiple of Five"
      case _ => "Not a Multiple of Three or Five"
    }

    println(categorizeNumber(input))
  }
}
