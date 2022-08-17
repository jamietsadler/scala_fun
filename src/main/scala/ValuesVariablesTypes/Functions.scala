package ValuesVariablesTypes

object Functions extends App{
  def aFunction(a: String, b: Int): String = {
        a + " " + b
  }

  println(aFunction("Hello", 3))

  def aParameterLessFunction(): Int = 43
  println(aParameterLessFunction())

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n==1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello", 3))

  // Scala uses recursion instead of loops

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)


  def greeting(name: String, age: Int): String = {

    return "Hi ny name is " + name + " and my age is " + age

  }

  println(greeting("Dave", 25))

  def factorial(n: Int): Int = {
    if (n <= 0) 1
    else n*factorial(n - 1)
  }

  println(factorial(15))

  def fibonacci(n: Int): Int = {

    if (n <= 2) 1
    else fibonacci(n-1) + fibonacci(n-2)
  }

  val fib = fibonacci(34)
  println(fib)

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(n/2)
  }

  println(isPrime(20))
  println(isPrime(23))

}
