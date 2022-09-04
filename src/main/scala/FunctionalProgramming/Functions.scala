package FunctionalProgramming

object Functions extends App{
    // DREAM: Use functions as first class objects
    // PROBLEM: OOP
  class Action {
      def execute(element: Int): String = ???

    }

    val doubler = new MyFunction[Int, Int] {
      override def apply(element: Int): Int = element * 2

    }

    println(doubler(2)) // can be called as if a function

    //
    val stringToIntConverter = new MyFunction[String, Int] {
      override def apply(string: String): Int = string.toInt

    }


    trait MyFunction[A, B] {
      def apply(element: A): B

    }

    println(stringToIntConverter("3") + 4)

    // Function Types Function2[A, B, R] === (A, B), => R

    // All scala functions are objects

    def concatenator: (String, String) => String = new Function2[String, String, String]  {
      override def apply(a: String, b: String): String = a + b
  }

    println(concatenator("Hello ", "Scala"))

    val superAdder: Function1[Int, Function1[Int, Int]] = new Function1[Int, Function1[Int, Int]] {

      override def apply(x: Int): Function1[Int, Int] = new Function1[Int, Int] {
        override def apply(y: Int): Int = x + y

      }
    }

    val adder3 = superAdder(3)
    println(adder3(4))

    println(superAdder(6)(4)) // curried function (higher order).

    
}
