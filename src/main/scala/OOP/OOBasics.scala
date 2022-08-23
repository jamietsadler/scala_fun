package OOP

object OOBasics extends App{
  val person = new Person("John", 37)
  println(person.age)

  val j : Int = 5
  person.greeting("ssdsd")
  println(j.getClass)

  val author = new Writer("Charles", "Dickens", 1812)

  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge())

  val counter = new Counter

  counter.inc
  counter.inc(10)



}

class Person(name: String, val age: Int) { // constructor
  // body
  val x = 2 // field


  def greeting(name: String): Unit = { // method
    println(s"${this.name} says Hi $name")
  }

  // overloading -> methods with same name

}

// class parameters are not fields that you can access with '.'
// convert to field by adding val or var

class Writer(firstName: String, lastName: String, val year: Int) {
  def fullName: String = firstName + " " + lastName

}

class Novel(name: String, year: Int, author: Writer) {
  def authorAge() = year - author.year
  def isWrittenBy(author: Writer) = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)

}

class Counter(val count: Int = 0){
  def inc = new Counter(count + 1) // immutability
  def dec = new Counter(count - 1)

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n - 1)

  }
  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n - 1)
  }

}