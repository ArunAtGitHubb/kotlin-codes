fun main() {
    val laserPrinter = LaserPrinter("Xerox", "p-32", 32)
    val specialLaserPrinter = SpecialLaserPrinter(
        "Xerox",
        "p-50",
        50,
        190.99
    )

    laserPrinter.printModel()
    laserPrinter.printSpecification()
    specialLaserPrinter.printModel()
    specialLaserPrinter.printSpecification()

    laserPrinter.printDetails()
    specialLaserPrinter.printDetails()

    val msg = Messaging()
    msg.printMsg(msg="Hello", to="Arun", from="God" )
    msg.printModel()
}

// as default in kotlin access modifier in public final
// so, in here without `open` we can't inherit the Printer class
// when we add `open` keyword access modifier will be public

/*
open class Printer(private val modelName: String) {
    fun printModel() = println("The model of Printer $modelName")
}*/

// here we aren't add open keyword, but also we can inherit the Printer class
// because of abstract keyword
// there is no sense in abstract and open keyword at the same time for class
abstract class Printer(private val company: String, private val modelName: String) {
    fun printModel() = println("\nThe model $modelName Printer from $company")
}

open class LaserPrinter(
    private val company: String,
    private val modelName: String,
    private val ppm: Int
) : Printer(company, modelName) {
    open fun printSpecification() {
        println("\tSpecification \n  -------------------")
        println("company: $company, model: $modelName, ppm: $ppm")
    }

    // without `open` keyword we can't override this function
    fun printDetails(){
        println("company: $company, model: $modelName")
    }
}

class SpecialLaserPrinter(
    private val company: String,
    private val modelName: String,
    private val ppm: Int,
    private val price: Double
) : LaserPrinter(company, modelName, ppm) {
    override fun printSpecification() {
        println("\n\tSpecification \n  __________________")
        println("company: $company, model: $modelName, ppm: $ppm, price: $price")
    }
}

// we can't inherit the data class whatever open keyword is applied!

/*
open data DataClass{ // this would be error

}
*/

// Interface can't contain primary constructor
// because we cannot instantiate the interface
// as default interface's methods are abstract,
// which means implementing classes should be overridden the interface's methods,
// default access modifier in interface in public abstract
interface InterFace{
    fun printMsg(msg: String)
}

interface SubInterface: InterFace{
    fun printMsg(msg: String, from: String, to: String)
}

class Messaging: SubInterface, Printer("Mice", "x-80") {
    override fun printMsg(msg: String) {
        println(msg)
    }

    override fun printMsg(msg: String, from: String, to: String) {
        println("$to got '$msg' msg from $from")
    }
}

