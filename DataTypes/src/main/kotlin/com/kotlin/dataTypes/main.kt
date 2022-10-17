import javaCodes.Dummy

fun main(args: Array<String>) {
    // As it is default, int is a data type
    // Int
    val myInt = 20 // int
    val myInt2: Int = 20

    // As it is default, floating point number will be double data type
    // Float
    var myDouble = 20.666  // double
    val myFloat: Float = 20.00f  // float

    // In kotlin, we can't assign int to char. Like in the `java`
//    val myChar: Char = 23  // this will give an error

    /* Type casting
        unlike java, there are no automatic type conversion in kotlin
    */

    myDouble = myFloat.toDouble() // implicit type conversion


    // Arrays
    var array = arrayOf("Arun", 19, 16, 2, 2002)
    var arrayOfAny: Array<Any> = arrayOf("Arun", 19, 16, 2, 2002)
    var arrayOfInt : Array<Int> =  arrayOf(1, 3, 5, 7, 9)

    var floatArray = floatArrayOf(3.14f, 5.6f, 6.2f)
    var tenMultiplierArray = Array(5) { i -> i * 10}

    Dummy().printIntArray(tenMultiplierArray.toIntArray())
}
