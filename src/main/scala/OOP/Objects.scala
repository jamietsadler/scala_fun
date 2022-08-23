package OOP

object Objects extends App{
  // Scala does not have class level functionality, has objects instead.

  object Person {
    val N_EYES = 2
    def canFly: Boolean = false

    def apply(mother: Person, father: Person): Person ={
      new Person("Bobbie")
    }
  }

  println(Person.N_EYES)
  println(Person.canFly)


  class Person(name: String) {


  }


  // Scala Application -> Scala application with def main(args: Array[String]): Unit


}
