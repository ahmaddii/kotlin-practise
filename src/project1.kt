import kotlin.concurrent.timerTask

data class Person(

    val name: String,
    val age: Int
)

fun showPersonDetails(person: Person) {

    println("Name: ${person.name} and Age is ${person.age}")

}

fun loginInfo(time: List<String>, day: List<String>) {

    day.forEach {day -> println("$time, at $day") }

}

fun main() {

    val LoginDayDetails = mutableListOf<String>("Monday","Tuesday","Wednesday")
    val TimeDetails = mutableListOf<String>("12:00","13:00","14:00")

    println("Person Details")

    // now use that specific model class

    val person = Person(

        name = "Ahmad",
        age = 3
    )
    showPersonDetails(person)
   loginInfo(time = TimeDetails, day = LoginDayDetails)

}
