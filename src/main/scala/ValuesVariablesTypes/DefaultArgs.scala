package ValuesVariablesTypes

import scala.annotation.tailrec

object DefaultArgs extends App{

  @tailrec
  def tRFac(n: Int, acc:Int = 1): Int = {
    if (n <= 1) acc
    else tRFac(n-1, n*acc)
  }

  val fact10 = tRFac(10, 1)
  println(fact10)

  


}
