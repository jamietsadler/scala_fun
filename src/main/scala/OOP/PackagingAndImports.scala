package OOP

import java.util.Date
import java.sql.{Date => sqlDate} // can use aliasing

object PackagingAndImports extends App{
  // Package members are accessible by their simple name, otherwise need to import
  val writer = new Writer("asdasd", "asda", year = 2004)

  val date = new java.util.Date
  val sqlDate = new sqlDate(2018, 4, 3)
}
