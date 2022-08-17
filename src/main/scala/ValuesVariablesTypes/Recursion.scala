package ValuesVariablesTypes

import scala.annotation.tailrec

object Recursion extends App{
  def factorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factHelper(x - 1, x*accumulator) // Tail Recursion -> use recursion call on last line
  }

     return factHelper(n, 1)
  }

  println(factorial(50))

  // When using loops, use tail recursion instead.
def concatenateTailRec(aString: String, n: Int, accumulator: String): String = {
  if (n <=0 ) accumulator
  else concatenateTailRec(aString, n-1, aString + accumulator)
}

  println(concatenateTailRec("Hello", 12, ""))


  def isPrime(n: Int): Boolean = {
    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean = {
      if(!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailRec(t-1, n%t != 0 && isStillPrime)
    }

    isPrimeTailRec(n/2, true)

  }

  println(isPrime(23))
  println(isPrime(20))

  def fibonacci(n: Int): Int = {
    def fibTailRec(i: Int,last: Int, nextToLast: Int): Int ={
      if (i>=n) last
      else fibTailRec(i+1, last + nextToLast, last)
    }

    if (n <= 2) 1
    else fibTailRec(2, 1, 1)

  }

  println(fibonacci(34))


}
