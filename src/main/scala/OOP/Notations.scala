package OOP

object Notations extends App{

  class Person(val name: String, favouriteMovie: String) {
    def likes(movie: String): Boolean = {
      if (movie == this.favouriteMovie) {
        return true
      }
      else false
    }

    def hangoutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
  }

  val mary = new Person("Mary", "Inception")

  println(mary.likes("Inception"))
  println(mary likes "Inception") // infix or operator notation, only works on methods with one parameter

  val tom = new Person(name = "Tom", favouriteMovie = "Fightclub")
  println(mary hangoutWith tom)

  println(1 + 2)
  println(1.+(2))

  // mathematical operators are mthods in scala




}

