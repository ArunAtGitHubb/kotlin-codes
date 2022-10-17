import java.lang.NumberFormatException

fun main() {
    println("Enter number to convert as type Int")
    var str = readLine()
    println(strToInt(str!!)?.javaClass ?: "Hey dump-ass, enter number only!")
    print(strToInt(str))
}

fun strToInt(str: String): Int? {
    return try {
        str.toInt()
    }catch (e: NumberFormatException){
        null
    }
    finally {
        println("Finally block doesn't do anything with try-catch")
    }

}