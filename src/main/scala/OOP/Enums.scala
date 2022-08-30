package OOP

object Enums{
  enum Permissions {
    case READ, WRITE, EXECUTE, NONE

    // add fields or methods

    def openDocument(): Unit =
      if (this == READ) println("Opening document")
      else println("Reading not allowed")

  }

  val somePermissions: Permissions =  Permissions.READ

  enum PermissionsWithBits(bits: Int) {
    case READ extends PermissionsWithBits(4) // 100
    case WRITE extends PermissionsWithBits(2) // 010
    case EXECUTE extends PermissionsWithBits(1) // 001
    case NONE extends PermissionsWithBits(0) // 000

  }

  object PermissionsWithBits {
    def fromBits(bits: Int): PermissionsWithBits = PermissionsWithBits.NONE

  }

  // standard API
  val somePermissionsOrdinal = somePermissions.ordinal
  val allPermissions = PermissionsWithBits.values



  def main(args: Array[String]): Unit = {
    somePermissions.openDocument()
    println(somePermissionsOrdinal)

  }


}
