
fun main() {
    val carMap = mapOf(
        1 to Car("Red", "Tesla"), // key type - Int
        2L to Car("Blue", "Tesla"), // key type - Long
        3.154f to Car("White", "BMW"), // key type - Float
        4.32 to Car("White", "Tesla"), // key type - Double
        true to Car("Black", "Rolls Royce"), // key type - Boolean
        'c' to Car("White", "Ford"), // key type - Char
        "string" to Car("Black", "Ford"), // key type - String
        Car("light blue", "honda") to Car("White", "Rolls Royce"),
        // key type - User defined type
    )
    // in map key type can be Any, but in value it must be same type
    // if we want to prevent key's type then, declare map like this
    // val carMap = mapOf<Int, Car>()

    println(carMap)
    val carList = carMap.map { it.value }

    println(carList.find { it.color === "White" })
    println(carList.filter { it.company == "Tesla"}.map { it.color })

    println(carList.contains(Car("White", "Tesla")))
    carList.groupBy { it.company }.forEach { println(it) }
}
