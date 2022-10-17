package com.kotlin.challenges

fun main() {
// print the fibonacci series up to 15 elements
// 0, 1, 1, 2, 3, 5, 8, 13, 21, ...

//    var first = 0
//    var second = 1
//    var sum = first + second
//    for(i in 1..10){
//        println(first)
//        second = first
//        first = sum
//        sum =first + second
//    }

//    print 1, 11, 100, 99, 98, 2

//    for (i in 1..10){
//        println(i)
//        if(i == 2) break
//        for (j in 11..20){
//            println(j)
//            for (k in 100 downTo 90){
//                println(k)
//                if(k == 98) break
//            }
//            if(j == 11) break
//        }
//    }

    // declare num type of int and assign anything you want
    // declare dnum type of double and assign follows:
    /*
    * num >= 100 ==> dnum = 6.34213
    * num <= 100 ==> dnum = 4.6232
    * num == 0   ==> dnum = 0.0
    in one statement/expression
    * */

    var num: Int = 90
    var dnum = when{
        num >= 100 -> 6.34213
        num <= 100 -> 4.6232
        else -> 0.0
    }

    println(dnum)

}