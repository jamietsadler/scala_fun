package FunctionalProgramming

object AnonymousFunctions extends App{
  val doubler: Int => Int = (x) => x*2 // anonymous or lambda

  // multiple params in lambda:
  val adder: (Int, Int) => Int = (a: Int, b: Int) => a + b

  // no params
  val nothingFunc: () => Int = () => 3
  println(nothingFunc)
  println(nothingFunc())

  val stringToInt = { (str: String) =>
    str.toInt
  }

  // MOAR syntax
  val niceIncrementor: Int => Int =  _ + 1 // equivalent to x + 1




}
