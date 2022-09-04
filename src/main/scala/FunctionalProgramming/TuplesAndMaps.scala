package FunctionalProgramming

object TuplesAndMaps extends App{
  val aTuple = new Tuple2(2, "Hello scala") // syntactic sugar, val aTuple[Int, String] = new Tuple(2, 'asda').

  println(aTuple)
  println((aTuple._1))
  println((aTuple._2))

  val aMap: Map[String, Int] = Map()

  // val phonebook = Map(("asda", 234234), "sdasd" -> 231231)).withDefaultValue(-1)

  val phonebook = Map(("Jim", 221), "sdfs" -> 123123)

  val newPairing = "Mary" -> 123123
  val newPhoneBook = phonebook + newPairing

  println(newPhoneBook)

  println(newPhoneBook.map(pair => pair._1.toLowerCase -> pair._2))

  println(newPhoneBook.filterKeys(x => x.startsWith("J")))

  println(phonebook.mapValues(number => 2123 + number))

  def add(network: Map[String, Set[String]], person: String): Map[String, Set[String]] = {
    network + (person -> Set())

  }

  def friend(network: Map[String, Set[String]], a: String, b: String): Map[String, Set[String]] = {
    val friendsA = network(a)
    val friendsB = network(b)

    network + (a -> (friendsA + b)) + (b -> (friendsB + a))
  }

  def unFriend(network: Map[String, Set[String]], a: String, b: String): Map[String, Set[String]] = {
    val friendsA = network(a)
    val friendsB = network(b)

    network + (a -> (friendsA - b)) + (b -> (friendsB - a))
  }

  def remove(network: Map[String, Set[String]], person: String): Map[String, Set[String]] = {
    def removeAux(friends: Set[String], networkAcc: Map[String, Set[String]]): Map[String, Set[String]] = {
      if (friends.isEmpty) networkAcc
      else removeAux(friends.tail, unFriend(networkAcc, person, friends.head))

    }

    val unfriended = removeAux(network(person), network)
    unfriended - person

  }

  val empty: Map[String, Set[String]] = Map()
  val network = add(add(empty, "Jim"), "Mary")

  println(network)

  println(friend(network, "Bob", "Mary"))
  println(unFriend(network, "Bob", "Mary"))





}
