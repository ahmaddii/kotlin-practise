fun sayHello(greeting: String, vararg itemstoGreet: String) {

    itemstoGreet.forEach { itemstoGreet -> println("$greeting $itemstoGreet") }

}

// vararg is like array  and I have stored stings elements in it

// we can also pass default value to this

fun greetPerson(greeting: String = "Hello", name:  String = "Khan") = println("$greeting $name")

fun main() {

    // removing explicit arguments from class constructer
    val person = person() // no new for instance creation of class

    person.firstName // property access syntax without getter setter
    person.LastName
    person.nickName = "Baba"

    person.nickName = "new baba"
    println(person.nickName)

    person.printInfo()
   // sayHello(greeting = "Hello", "Kotlin","Cpp","Comic one")

   // val interstingThings = arrayOf("Kotlin","Cpp")

   // greetPerson(name = "Ahmad")
   // greetPerson() // get default values without getter setters concepts which used in old java oop
   // sayHello(greeting = "Hi",*interstingThings)
}