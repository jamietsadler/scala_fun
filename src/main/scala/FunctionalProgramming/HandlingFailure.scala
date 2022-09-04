package FunctionalProgramming
import scala.util.{Try, Success, Failure}

object HandlingFailure extends App{
  val aSuccess = Success(3)
  val aFailure = Failure(new RuntimeException("Failure"))

  println(aFailure)

  def unsafeMethod(): String = throw new RuntimeException("asdadasd")

  val potentialFailure = Try(unsafeMethod())
  println(potentialFailure)

  def aBackupMethod(): String = "A valid result"

  val fallbackTry = Try(unsafeMethod()).orElse(Try(aBackupMethod()))

  println(fallbackTry)
}
