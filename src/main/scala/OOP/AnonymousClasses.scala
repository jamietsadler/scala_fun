package OOP

object AnonymousClasses extends App{
  absract class Animal {
    def eat: Unit

  }

  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("ahahaha")

  }

  println(funnyAnimal.getClass)

  class Person(name: String) {
    def sayHi: Unit = println(s"Hi my name is ${name}")

  }

  val jim = Person(name = "Jim") { // pass in required constructor arguments if needed
    // implement all abstract fields/methods
    override def sayHi: Unit = println("sdfsdf")

  }

}
