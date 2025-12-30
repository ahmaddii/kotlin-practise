
var name: String = "Ahmad"
var greeting: String? = null

val age = 12
// for null assign we have to assign type of vars

var name2: String? = null // ? so that we can assign null to string


fun main() {
    // var of type name and I put ahmad inside it

  //  name = "Ali"

    // for ,var we can change the value but for val value we cant

   // greeting = "Nah I am Hassan"
   // greeting = "Ahmad g"

    greeting = "Hello khan g"



    // similar like switch statment
    when (greeting) {

        null -> println("Hi")
        else -> println(greeting)

    }

    when (name2) {

        null -> println("Its Null Bro")
        else -> println(name2)
    }


    // handling nullable values if not null print greet else null print hi

    //if (greeting != null) {

      //  println(greeting)
        //} //else {
        //println("Hi")
    //}

    println(name)
    println(age)




}

// var mutable and val immutable