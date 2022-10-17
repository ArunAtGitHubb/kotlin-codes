fun main(args: Array<String>) {
    val strList = mutableListOf<String>("Hello")
    strList.add("string")
    strList.add("another string")

    strList.printCollection()

    val decimalList = mutableListOf<Double>(3.154)
    decimalList.add(2.54)
    decimalList.add(7.99)

    decimalList.printCollection()
}

// <T> tells this function takes Generic parameter type
// this is generic extension function
fun <T> List<T>.printCollection(){
    println(this.javaClass)
    for (item in this){
        println(item)
    }
}

/**
* this is generic normal function
* @see array it will be generic array
*/
fun <T> printArray(array: Array<T>){
    for (item in array){
        println(item)
    }
}