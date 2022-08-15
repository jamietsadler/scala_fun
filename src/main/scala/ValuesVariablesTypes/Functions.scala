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



}
