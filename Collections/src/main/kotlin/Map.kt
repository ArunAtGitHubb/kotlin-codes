fun main() {
    // java.util.LinkedHashMap is a default mapOf, linkedMapOf function's type
    // we can also specify the type of map
    val map = linkedMapOf<String, Int>("One" to 1, "Two" to 2)
    val immutableMap = mapOf<Int, Car>(
        1 to Car("Red", "Tesla"),
        2 to Car("White", "Audi"),
        3 to Car("Black", "Ford"),
        4 to Car("Yellow", "Lamborghini")
    )

    val mutableMap = hashMapOf<Int, String>(
        1 to "One",
        2 to "Two",
        3 to "Three",
        4 to "Four",
        6 to "Six",
        7 to "Seven"
    )
    mutableMap.putIfAbsent(5, "Five")

    println(mutableMap.getOrDefault(8, "defaultEight"))
    mutableMap.forEach(){
        println("${it.key} --> ${it.value}")
    }

    // destructuring the map
    for ((key, value) in immutableMap) {
        val (color, company) = value
        println("key: $key, value: Car($color, $company)")
    }

    val (color, company) = Car("white", "Honda")
    println("$color, $company")

    println("map.javaClass = ${map.javaClass}")
    println("mutableMap.javaClass = ${mutableMap.javaClass}")
    println("immutableMap.javaClass = ${immutableMap.javaClass }")
}

