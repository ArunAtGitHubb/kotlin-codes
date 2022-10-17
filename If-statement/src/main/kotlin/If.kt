fun main() {
    // we can't use ternary operator in kotlin
    // but there is way to achieve that how the ternary operator works
    // The if statement

    val val1 = readLine().toString()
    val val2 = readLine().toString()
    val condition = val1 > val2
    val num = if (condition) "$val1 is > than $val2" else "$val2 is > than $val1"

    // we can also use if statement as an expression
    // when we use if statement as an expression don't forget the else block
    // why we don't forget the else block in use of expression, think Arun ¬_¬

    val bigOne = if (condition) {
        println("$val1 is bigger")
        val1
    } else {
        println("$val2 is bigger")
        val2  // return can't use
    }

    println("bigOne = $bigOne, num = $num")
}