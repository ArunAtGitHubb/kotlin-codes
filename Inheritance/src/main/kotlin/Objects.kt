import java.time.Year

fun main() {
    println("\t\tSingleton Object")
    println(SingletonObject.getTagline())
    println(SingletonObject.getCopyRights())
    println("\t\t\t__________________________")

    println("\t\tCompanion Object")
    println(CompanionObject.method())
    println(CompanionObject.getPrivateVar())
    println("\t\t\t__________________________")

    withInterfaceAsParam(object: Interface{
        override fun mustImplement(num: Int): String {
            return "this from mustImplement ${num * 10}"
        }
    })
}

// Because of there is no `static` keyword in kotlin Lang
// The object keyword is used to create Singleton Objects, Companion Objects, Anonymous Objects

// Singleton Object - * which means only one instance will be generated at run-time in memory.

object SingletonObject{
    private val fromYear = Year.now().value - 4
    private val currentYear = Year.now().value

    fun getTagline() = "Today Learn, Tomorrow Lead!"
    fun getCopyRights() = "Copyright \u00A9 act 1995, All rights reserved to me $fromYear to $currentYear"
}

// Companion Object - * Which means they are act like static methods,
//                    * Fun fact, kotlin doesn't have static keyword
//                    * We can also instantiate the class,
//                      but there is no point in use of `companion object` - this is one point of view
//                    * We can also make class instantiatable
//                    * If we want to prevent instantiating from these class,
//                      make primary constructor as private

class CompanionObject private constructor(){
    companion object Name{
        private const val privateVar = 10
        fun getPrivateVar() = "accessing privateVar: $privateVar"
        fun method(){
            println("this static method only available when it's accessing via class")
        }
    }
}

interface Interface{
    fun mustImplement(num: Int): String
}

fun withInterfaceAsParam(i: Interface){
    println("This in withInterfaceAsParam function ${i.mustImplement(20)}")
}
