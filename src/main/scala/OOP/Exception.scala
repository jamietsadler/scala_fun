package OOP

object Exception extends App{
  val x: String = null

  //val aWeirdValue: String = throw new NullPointerException
  // Exceptions are instances of classes

  // throwable classes extend Throwable class
  // Exception and errors are main ones

  // How to catch exceptions
  def getInt(withExceptions: Boolean): Int = {
    if (withExceptions) throw new RuntimeException("No int")
    else 42

  }

    val potentialFail = try {
      getInt(true)
    } catch {
      case e: RuntimeException => println("Caught runtime exception")

    } finally {
      // code that will be executed no matter what
      // Optional
      // Does not influence return type.
      // Use finally only for side effects.
      println("finally")
  }

    println(potentialFail)


    // Defining own exceptions

    class MyException extends Exception

    val exception = new MyException
    //throw exception

    // val array = Array.ofDim(Int.MaxValue)

    def infinite: Int = 1 + infinite
    // val noLimit= infinite

    class OverflowException extends RuntimeException
    class UnderflowException extends RuntimeException

    object PocketCalculator {
      def add(x: Int, y: Int) = {
        val result = x + y
        if (x > 0 && y > 0 && result < 0) throw new OverflowException
        else if (x < 0 && y < 0 && result > 0) throw new UnderflowException
        else result
      }

      def subtract(x: Int, y: Int) = {
        val result = x - y
        if (x > 0 && y < 0 && result < 0) throw new OverflowException
        else if (x < 0 && y > 0 && result > 0) throw new UnderflowException
        else result
      }

      def multiply(x: Int, y: Int) = {
        val result = x * y
        if (x > 0 && y > 0 && result < 0) throw new OverflowException
        else if (x < 0 && y < 0 && result < 0) throw new OverflowException
        else if (x > 0 && y < 0 && result > 0) throw new UnderflowException
        else if (x < 0 && y > 0 && result > 0) throw new UnderflowException
        else result
      }
    }

}
