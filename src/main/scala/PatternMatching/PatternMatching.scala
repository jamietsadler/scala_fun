package PatternMatching
import scala.util.Random

object PatternMatching extends App{
  val random = new Random
  val x = random.nextInt(10)

  val description = x match {
    case 1 => "the One"
    case 2 => "Double or nothing"
    case 3 => "Third time a charm"
    case _ => "Something else" // wildcard

  }

  println(x)
  println(description)

  case class Person(name: String, age: Int)
  val bob = Person("Bob", 45)

  val greeting = bob match {
    case Person(n, a) if a < 21 => s"Hi, my name is $n and I am $a years old and I cant drink"
    case Person(n, a) if a < 21 => s"Hi, my name is $n and I am $a years old and I cant drink"
    case _ => "not sure"
  }

  println(greeting)

}
