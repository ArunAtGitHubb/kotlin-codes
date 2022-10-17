fun main() {
    // `arrayOf` function creates array of the specific type
    // example array of integer as JVM understandable `int[]`
    // but, `arrayOfList` makes a variable `java.util.ArrayList` type

    val strList = listOf("str1", "str2", "str3") // immutable list
    println(strList.javaClass)
    val intList1 = arrayListOf(1, 2, 4, 5, 6)  // mutable list
    val intList2 = mutableListOf(1, 2, 4, 5, 6)
    println(intList1.javaClass)
    println(intList2.javaClass)

    val intList3 = arrayOf(1, 2, 3, 4, 6, 7) // array of integer
    val intList4 = arrayListOf(*intList3, *intList1.toArray())
    // Because we can't concatenate the ArrayList and kotlin array,
    // so we convert the ArrayList into array (intList1.toArray())
    // then we spread the converted array
    println(intList4)

    val newList = strList + intList1  // concatenate two ArrayList

    println("$strList + $intList1 = $newList" )

}