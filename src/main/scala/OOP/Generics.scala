package OOP

object Generics extends App{
  class MyList[A]{


  }

  // generic methods
  object MyList {
    def empty[A]:  MyList[A] = ???
  }

  val emptyListOfIntegers = MyList.empty[Int]

  class Animal
  class Cat extends Animal
  class Dog extends Animal

  class CovariantList

}
