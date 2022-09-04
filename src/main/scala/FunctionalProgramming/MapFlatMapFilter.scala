package FunctionalProgramming

object MapFlatMapFilter extends App{
  val list = List(1, 2, 3)
  println(list)
  println(list.head)
  println(list.tail)

  println(list.map(_ + 1))
  println(list.map(_ + "asdasd"))

  println(list.filter(_ % 2 == 0))

  val toPair = (x: Int) => List(x, x+1)
  println(list.flatMap(toPair))

  val numbers = List(1, 2, 3, 4)
  val chars = List("a", "b", "c", "d")

  val combinations = numbers.flatMap(n => chars.map(c => "" + c + n))

  println(combinations)
  val colours = List("Black", "White")

  // iterating
  val combinations2 = numbers.flatMap(n => chars.flatMap(c => colours.map(colour => "-" + c + n + colour)))
  println(combinations2)

  list.foreach(println)

  // for-comprehensions

  val forCombinations = for{
    n <- numbers
    c <- chars
    col <- colours
  } yield c + n + "-" + col

  println(forCombinations)

  val forCombinations2 = for {
    n <- numbers if n % 2 == 0
    c <- chars
    col <- colours
  } yield c + n + "-" + col

  println(forCombinations2)

  for {
    n <- numbers
  } println(n)




}
