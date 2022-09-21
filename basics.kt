//Top Level Variables
var greeting: String = "Hello"

//null as a valid value for a variable
//var secGreeting: String? = ", Morning!"

//TYPES ARE NOT NULL BY DEFAULT IN KOTLIN

fun main(args: Array<String>) {
    //println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.

    //Variables in Kotlin

    //MUTABLE
    // Declared with var
    var name: String = "Sam" //values can be updated

    //NonMutable
    //Declared with val
    val lastName: String = "Jain" //values cannot be updated
//    secGreeting = null

//    if (secGreeting != null)
//    {
//        println(greeting + secGreeting)
//    }
//    else
//    {
//        println(greeting)
//    }

    //when is like switch in java
//    when (secGreeting) {
//        null -> println(greeting)
//        else -> println(greeting)
//    }
//    println(greeting + secGreeting)

    val greetingToPrint = if (greeting != null) greeting else "Hi" //when can be used as well
    println(greetingToPrint)
    println(name + lastName)
}