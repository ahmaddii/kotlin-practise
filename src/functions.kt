
// Top Level Functions without a class

fun getGreeting(): String {
    return "Hello Greeting"
}

fun sayHello() {

    println(getGreeting())

}

fun testfunction() = println("Test one")

// parameters function in kotlin

fun newfunc(greeting: String,itemtoGreet: String) = println("$greeting $itemtoGreet")

    //val msg = "Hello  $itemtoGreet" // string literal


fun singlefuncc(): String = "Hello single expression function"


// unit return type function return nothing useful
// its like a void in java

fun log(): Unit = println("Logging")

fun add(num1: Int , num2: Int): Int {

    return  num1 + num2

}

fun sub(num1: Int, num2: Int): Int {

    return  num1 - num2
}

fun main() {

    println("Hello Kotlin")
    println(getGreeting())
    sayHello()
    singlefuncc()

    newfunc(greeting = "Hi", itemtoGreet = "Fahad")
    newfunc(greeting = "Hello", itemtoGreet = "Subhan")

    testfunction()

    println(add(10,30))
    println(sub(10,20))

    testfunction()

}