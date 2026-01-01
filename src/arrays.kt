// now we modified the func to get multiple itemes collectiom as a paramter

fun sayHello(greeting: String, itemtoGreet: List<String>) {

    itemtoGreet.forEach { itemtogreet -> println("$greeting $itemtogreet") } // now iterate through each list to print
}

// today we learn three collection types in kotlin maps array or list
// by default collections are immutable

fun main() {

    //val interestingThings = listOf("Kotlin","Python","Java") // by default its immutable

    val interstingthings = mutableListOf("Koltin","Cpp")
    interstingthings.add("sharp")
    println(interstingthings)

    val map = mutableMapOf(1 to "A", 2 to "B", 3 to "C", 4 to "D")

    map.put(5 , "F") // by putting you can add new map key value pair sepearte by ,
   // println(map)

    // how to iterate over each element

    map.forEach { key,value -> println("$key =  $value") } // it prints key = value

    sayHello(greeting = "Hello", itemtoGreet = interstingthings)
   // interestingThings.get(0)
   // interestingThings[1]

   // interestingThings.forEach { interesting -> println(interesting) }




    //println(interestingThings.size)
    //println(interestingThings[0])
    //println(interestingThings.get(1))

   //  interestingThings.forEachIndexed { index, interseingthing -> println("$interseingthing is at index $index")  }


   // interestingThings.forEach {interestingthing -> println(interestingthing)  } // built in for each element

    //for (i in interestingThings) {
//
      //  println(i) // iterate throughtout the array


  //  }



}