package OOP

object CaseClasses extends App{

  case class Person(name: String, age: Int){
    // class parameters are fields


  }

  val jim = new Person("Jim", 34)
  println(jim.name)

  // sensible toString
  println(jim.toString)
  println(jim)

  // equals and hascode implemented out the box

  val jimTwo = new Person(name = "Jim", age = 34)

  println(jim == jimTwo)

  // CCs have handy copy method
  val jim3 = jim.copy(age = 45)

  //CCs have companion objects
  val aPerson = Person
  val mary = Person("Mary", 28)

  // CCs are serializable (Akka, messages generally case classes).

  // Cases classes have  extractor pattern -> can be used in pattern mathcing





}
