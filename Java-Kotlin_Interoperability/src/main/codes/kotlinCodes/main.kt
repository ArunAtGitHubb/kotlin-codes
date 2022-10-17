@file:JvmName("MainKt")
// default name is Capitalized file name + extension ==> MainKt

package kotlinCodes

import javaCodes.Car
import java.io.IOException
import kotlin.jvm.Throws

fun main() {
    val tesla = Car("Red","Tesla", "2018")
    println(tesla)
}

object SingletonObj{
    fun fibonacci(N: Int){
        var first = 0
        var second = 1
        var total: Int = 0
        for(i in 1..N){
            println(total)
            total = first + second
            second = first
            first = total
        }
    }

    @JvmStatic
    fun printStr(str: String){
        println(str)
    }
}

class Game(){
    companion object{
        private var win = false
        @JvmField var points = 0

        @JvmStatic
        fun addPoints(){
            points += 1
            if(points >= 3){
                win = true
            }
        }

        fun removePoints(){
            points -=1
            println("Game Status, Win: $win")
        }
    }
}

@Throws(IOException::class)
fun doIO(){
    throw IOException("For testing purpose")
}


@JvmOverloads
fun defaultArgs(str:String, num: Int = 10){
    println("$str: $num")
}