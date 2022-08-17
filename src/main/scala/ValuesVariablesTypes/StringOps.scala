package ValuesVariablesTypes

object StringOps extends App{
  val str: String = "Hello I am a string"

  println(str.charAt(2))

  println(str.substring(2, 7))

  println(str.split(" ").toList)

  println(str.replace(" ", "-"))

  println(str.toLowerCase())

  println(str.length)

  val aNumberString: String = "45"

  println(aNumberString.toInt)

  println(str.reverse)
  println(str.take(2))

  val name: String = "Dave"
  val age: String = "34"

  val greeting: String = s"Hello I am $name and I am $age years old"
  val greeting2: String = s"Hello I am $name and I am ${age + 5} years old"

  println(greeting)
  println(greeting2)


}
