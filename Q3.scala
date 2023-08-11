object Main extends App {
  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(number => {
      def isPrime(n: Int): Boolean = {
        if (n <= 1) false
        else if (n <= 3) true
        else {
          !(2 to Math.sqrt(n).toInt).exists(i => n % i == 0)
        }
      }
      isPrime(number)
    })
  }

  val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val output = filterPrime(input)

  println("Input: " + input)
  println("Output: " + output)
}
