fun main() {
    var intRange = 1..10  // .. - range operator
    var charRange = 'a'..'z'
    var strRange = "ABC".."XYZ"

    for (i in intRange step 3){
        print("$i ")
    }
    println("")
    for (c in charRange step 5){
        print("$c ")
    }
    println("")
    println("Arun" in strRange)

    for (i in 20 downTo 1 step 3){
        print("$i ")
    }
    println()
    var intArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("intRange: $intRange \nintArray: $intArray")

    val str = "Hello world"

    for (char in str){
        print("$char ")
    }
}