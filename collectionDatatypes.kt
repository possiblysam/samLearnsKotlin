fun sayHello(greeting: String, vararg peopleToGreat: String) {
    peopleToGreat.forEach { name ->
        println("$greeting, $name")
    }
}

fun main() {
    val arr = arrayOf("Kotlin","Learn")
    println(arr.size)
    println(arr[0])
    println(arr.get(0))

    //iteration over array
    for (i in arr) {
        println(i)
    }

    arr.forEach { a ->
    println(a)
    }

    arr.forEachIndexed { index, a ->
        println("$a is at index $index")
    }

    //LIst

    val lst = listOf("Kotlin", "Language", "Is", "Fun")
    lst.forEach { l ->
        println(l)
    }

    //Map

    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach {key, value -> println("$key -> $value")}

    //List/Map are immutable
    val newlst = mutableListOf("Animals")
    newlst.add("Dog")
    println(newlst)

    val newMap = mutableMapOf( 1 to "a")
    newMap.put(2,"b")
    newMap.put(3,"c")

    println(newMap)

    println(sayHello("Good Morning", "Sam","Sambhaw"))
    //48:36

    println(sayHello("Good Morning", "Sam"))

    //passing array of strings

    var names = arrayOf("Sam", "Sneha", "Satya", "Shebika")

    println(sayHello("Good Morning",*names))
}