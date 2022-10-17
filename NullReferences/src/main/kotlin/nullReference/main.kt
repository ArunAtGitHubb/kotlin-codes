package nullReference

fun main(args: Array<String>) {
    var str: String? = null  // this variable might be null

    println(str?.uppercase())

    // Elvis operator ==> ?:
    // it's act like if-else
    /*
        b = a ?: "assign the default value"

        if(a == null){
            b = "assign the default value"
        }else{
            b = a
        }
    */
    str = str ?: "new string to the str variable"
    println(str)


    val str2: String? = null
    // !! this non-null assertion operator
    // this will throw an exception if expression returns null
    val str3: String = str2!!  // throw a new exception in here!

    println(str3.uppercase())  // not here


    val str4: String? = null
//    printText(str4)  // Required: String, Found: String? (nullable String)
    str4?.let { printText(it) }
    val str5 = "This isn't nullable"

    println(str4 == str5)
}

fun printText(text: String){
    println(text)
}