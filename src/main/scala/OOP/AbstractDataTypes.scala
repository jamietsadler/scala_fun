package OOP

object AbstractDataTypes extends App{

  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"
    def eat: Unit = println("crunch crunch")

  }

  trait Carnivore {
    def eat(animal: Animal): Unit

  }

  class Crocodile extends Animal with Carnivore {
    override val creatureType: String = "Croc"
    def eat: Unit = println("nonmnomnom")
    def eat(animal: Animal): Unit = println(s"Im a croc and Im eating ${animal.creatureType}")

  }

  val dog = new Dog

  val croc = new Crocodile
  croc.eat(dog)

  // Abstract classes and traits can have abstract and non abstract types.
  // traits do not have constructor parameters
  // multiple traits may be inherited by same class
  // traits are behaviour

}
