package com.kotlin.challenges
import JavaCodes.JavaSupport

fun main(args: Array<String>){
    val float1: Float = -3180.382f
    var float2: Float = -3180.384f

    /*
    * @type val
        if we define non-null value to `val` variable then that variable always be a non-nullable variable
        because `val` type variables are one time assigning variables
    */
    val float3: Float?
    var float4: Float? = -31.89f

    val arrayShort: ShortArray = shortArrayOf(1, 2, 3, 4, 5)

    val arrayInts = Array<Int?>(40) {i -> (i + 1) * 5}
    arrayInts[3] = null
//    for(i in arrayInts){
//        println(i)
//    }

    JavaSupport().storeABC(CharArray(3) { i -> (i + 65).toChar() })

    var x: String? = "I AM IN UPPERCASE"
    var str: String = x?.lowercase() ?: "I Never Give Up"
//    println(str)

    println(x)
    x?.let {x = x?.lowercase()?.replace("am", "am not") }
    println(x)


    val nonNullVariable: Int?  = 5
    println(nonNullVariable!!.toDouble())
}

