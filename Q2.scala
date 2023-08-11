object Main extends App {
  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(number => number * number)
  }

  val input = List(1, 2, 3, 4, 5)
  val output = calculateSquare(input)

  println("Input: " + input)
  println("Output: " + output)
}
