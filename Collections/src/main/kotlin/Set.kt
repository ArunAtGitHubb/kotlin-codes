fun main() {
    var intSet = setOf<Int>(1, 2, 3, 4, 5, 6, 7)
    // plus(), minus(), drop() functions not exec inline it just returns the result
    println("initial intSet =  $intSet")

    intSet = intSet.plus(8).plus(7)
    println("after re-assign intSet to intSet.plus(8).plus(7) =  $intSet")

    intSet = intSet.minus(7)
    println("after re-assign intSet to intSet.minus(7) = $intSet")

    println("during intSet.drop(4) =  ${ intSet.drop(4) }")
    // Explanation for drop(n=4)
    // drop() neither drop the 4th element of set nor value of 4
    // drop() just drop the elements until the index is 4

    println("after all operations intSet = $intSet")
    println("intSet.javaClass = ${intSet.javaClass}")
}