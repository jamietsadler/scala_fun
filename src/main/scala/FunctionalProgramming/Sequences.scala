package FunctionalProgramming
import scala.util.Random

object Sequences extends App{
  // Sequences: general interface for data strctures
  val aSequence = Seq(1, 2, 3, 4)
  println(aSequence)
  println(aSequence.reverse)
  println(aSequence(2))
  println(aSequence ++ Seq(5, 6, 7)) // append
  println(aSequence.sorted)


  // Ranges
  val aRange: Seq[Int] = 1 to 10
  println(aRange)
  (1 to 10).foreach(x => println)

  val aList = List(1, 2, 3)

  val prepended = 42 :: aList
  println(prepended)

  val appended = aList :+ 42
  println(appended)

  val apple5 = List.fill(5)("apple")
  println(apple5)

  // Arrays
  val numbers = Array(1, 2, 3, 4)
  val threeElements = Array.ofDim[Int](3)
  numbers.foreach(println)
  threeElements.foreach(println)

  // Vectors
  //val myVector: Vector[Int] = Vector[1, 2, 3]
  //println(myVector)

  val maxRuns: Int = 1000
  val maxCapacity: Int = 100000

  def getWriteTime(collection: Seq[Int]): Double = {
    val r = new Random

    val times = for {
      it <- 1 to maxRuns
    } yield {
      val currentTime = System.nanoTime()
      collection.updated(r.nextInt(maxCapacity), 0)
      System.nanoTime() - currentTime
    }

    times.sum * 1.0 / maxRuns


  }

  // Vector default implementation of sequence due to speed

}
