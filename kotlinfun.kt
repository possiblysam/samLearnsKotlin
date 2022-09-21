//Return type needs not to be specified
//a function with return type String
fun getGreeting(): String {
    return "Hello"
}

//for a function to return NULL
fun nullReturn(): String? {
    return null
}

//One liner function
fun newGreeting() = "Hello, Good Morning"

//functions with parameters
fun greetWithName (name: String): String{
    return "Hello, $name"
}

fun main() {
    println(getGreeting())
    println(newGreeting())
    println(greetWithName("Sam"))
}