/*
only in this file for better understating
if(n is prefix for function){
    then that function will be normal function
}else if(e is prefix for function){
    then that function will be extension function
}
* */

fun main(args: Array<String>) {
    nMsg("hi", "Arun", "God")
    println("this is lowercase".eUpFirstLastChar())
}

// normal function
fun nMsg(msg: String, to: String, from: String): Unit {
    println("Hey $to, you got `$msg` msg from $from".eUpFirstLastChar())
}

//Extension function
/*
* Extension functions makes an illusion
* when we are added extension functions belongs to the class, then it will be acted as that class method
 // syntax
 * fun Class.function(don't use this class type argument): return this classType{
  }
* */

fun String.eUpFirstLastChar(): String {
    return this.substring(0, 1).uppercase() +
            this.substring(1, this.length - 1) +
            this.substring(this.lastIndex).uppercase()
}

