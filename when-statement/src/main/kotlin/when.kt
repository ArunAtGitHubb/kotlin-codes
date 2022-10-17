fun main() {
    // when statement is more like switch statement in java
    // but in kotlin via when statement we can achieve lot more operations

    // simple when
    val num = 10
    when(num){
        10 -> println("num is 10")
        20 -> println("num is 20")
        30 -> println("num is 30")
        else -> println("num isn't 10, 20 or 30")
    }

    // multiple condition in one line
    when(num){
        10, 20 -> println("num is 10 or 20")
        30, 40 -> println("num is 30 or 40")
    }

    // when statement with range operator
    val marks = 70
    when(marks){
        in 90..100 -> println("you got O grade")
        in 80..90 -> println("you got A+ grade")
        in 70..80 -> println("you got A grade")
        in 60..70 -> println("you got B+ grade")
        in 50..60 -> println("you got B grade")
        in 40..50 -> println("you got C grade")
        else -> println("You're fail")
    }

    // when statement as expression
    // when use `when` statement as expression the `else` is must. Because, why? let's think about it Arun
    println("Enter marks your marks 0-100: ")
    val grade = when(readLine()?.toInt()){
        in 90..100 -> "O grade"
        in 80..90 -> "A+ grade"
        in 70..80 -> "A grade"
        in 60..70 -> "B+ grade"
        in 50..60 -> "B grade"
        in 40..50 -> "C grade"
        else -> "You're fail"
    }
    println("You got $grade")

    // when statement with smart-cast
    val val2: Any = 56
    when(val2){
        is Int -> println("$val2 is type of Int")
        is String -> println("$val2 is type of String")
        is Float -> println("$val2 is type of Float")
    }

    //when statement as alternative for else-if ladder
//    if(condition){
//        // block-of-code
//    }else if(condition){
//        // block-of-code
//    }else if(condition){
//        // block-of-code
//    }else {
//        // finally else block
//    }

    println("Enter two integers")
    val num1 = readLine()?.toInt()
    val num2 = readLine()?.toInt()

    when{
        num1!! < num2!! -> println("$num1 < $num2")
        num1 > num2 -> println("$num1 > $num2")
        else -> println("$num1 === $num2")
    }
}