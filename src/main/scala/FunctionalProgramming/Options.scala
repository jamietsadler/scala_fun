package FunctionalProgramming
import scala.util.Random

object Options extends App{
  val newOption: Option[Int] = Some(4)
  val noOption: Option[Int] = None

  def unsafeMethod(): String = null

  val result = Option(unsafeMethod())

  println(result)

  def backupMethod(): String = "A valid result"
  val chainedResult = Option(unsafeMethod()).orElse(Option(backupMethod()))

  def betterUnsafeMethod(): Option[String] = None
  def betterBackupMethod(): Option[String] = Some("A valid result")

  val betterChainedResult = betterUnsafeMethod() orElse betterBackupMethod()

  println(newOption.isEmpty)

  println(newOption.map(_ * 2))
  println(newOption.filter(x => x > 10))
  println(newOption.flatMap(x => Option(x*10)))

  val config: Map[String, String] = Map(
    "host" -> "174.23.21",
    "port" -> "8888"
  )

  class Connection {
    def connect = "connected"
  }
  object Connection {
    val random = new Random(System.nanoTime())

    def apply(host: String, port: String): Option[Connection] =
      if (random.nextBoolean) Some(new Connection)
      else None
  }

  val host = config.get("host")
  val port = config.get("port")

  val connection = host.flatMap(h => port.flatMap(p => Connection.apply(h, p)))
  val connectionStatus = connection.map(c => c.connect)
  connectionStatus.foreach(println)




}
