package com.kotlin.challenges

fun  main(args: Array<String>){
    val msg = Message("Hello Arun", "god", "Arun")

    println(msg.getMessage())
    println("""
                  1
                 11
                111
               1111
    """.trimMargin(" 1"))  // default prefix would be | - pipe symbol
}

class Message(msg: String, sender: String, receiver: String){
    private var msgReceiver = receiver
    private var msgMsg = msg
    private var msgSender = sender

    fun getMessage(): String{
        return "$msgReceiver got '$msgMsg' from $msgSender"
    }
}