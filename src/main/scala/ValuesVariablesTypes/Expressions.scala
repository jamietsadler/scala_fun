package ValuesVariablesTypes

object Expressions extends App{
  val x = 1 + 2 // Expression

  println(2 + 3 * 6)

  println(4 == x)
  println(!(4 == x))

  var j = 3
  j += 2
  println(j)

  var i = 0

  while (i < 10){
    println(i)
    i += 1
  }

  // Everything in scala is an expression

  // Unit -> Void

  val aCodeBlock = {
    // Code blocks are expressions in scala
    val y = 2
    val g = 4
    if (g > y) "hello" else "goodbye"
    // code block is type of final expression
    // Have local scope
  }

  println(aCodeBlock)
}
