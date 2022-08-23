package OOP

object Inheritance extends App{

  class Animal {
    protected def eat = println("nomnomnom")
    val creatureType = "wild"

  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")

    }
  }

  val cat = new Cat

  cat.crunch

  class Person(name: String, age: Int)
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)


  class Dog extends Animal {
    override val creatureType: String = "Domestic"
    override def eat = println("crunch, crunch")
  }

  val dog = new Dog
  dog.eat
  println(dog.creatureType)

  class Rabbit(override val creatureType: String = "Either") extends Animal {
  }

  val unknownAnimal: Animal = new Rabbit("rabbit") // polymorphism

  unknownAnimal.creatureType


}
