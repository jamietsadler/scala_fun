package PatternMatching

object AllPatterns extends App{
  val x: Any = "scala"
  val constants = x match {
    case 1 => "A number"
    case "scala" => "the scala"
    case true => "The truth"

  }

  val matchAnything = x match {
    case _ =>

  }

  val matchVariable = x match {
    case something => s" Ive found $something"

  }



}
