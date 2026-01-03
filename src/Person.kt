class person(val firstName: String = "Ahmad", val LastName: String = "Khan") {

     // public , internal , private class or protected we can also make specific method private or public which only accessible within the class

     var nickName: String? = null // null value

        set(value) {

            field = value
            println("The new nick name is now $value")

        }

        get() {

            println("The returned value is $field") // getter
            return field
        }

    fun printInfo() {

        val nickNametoPrint = nickName ?: "no nickName" // else will operater to check nullity

            //if (nickName != null) nickName else "No NickName"

        println("$firstName $nickNametoPrint $LastName")

    }

    // for var it has getter setter both generated from compiler
    // for val it only generates getter beauase its immutable
   // init {
     //   println("init 1")
    //}

    // secondary constructer called
    //constructor(): this("Ahmad","khan") {

     //   println("Secondary Constructer")
   // }

   // init {
     //   println("init 2")
   // }

 //  val firstName: String = _firstName
  // val lastName: String = _LastName
    // init runs whenever an instance created we can create multiple init which runs in an order

  //  init {

    //    firstName = _firstName
      //  lastName = _LastName

   // }

}