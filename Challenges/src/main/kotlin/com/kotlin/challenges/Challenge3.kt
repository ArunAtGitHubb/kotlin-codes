package com.kotlin.challenges

// Challenge - 3

fun main() {
    val bicycle = Bicycle("Bicycle", 3, 30)
    val mountainBike = MountainBike("Mountain Bike",  70, 12, 15)
    val roadBike = RoadBike("Road Bike", 5, 95, 8, 8)

    bicycle.printDescription()
    mountainBike.printDescription()
    roadBike.printDescription()

    MountainBike.getColorList()

}

open class Bicycle(var type: String, var speed: Int, var cadence: Int, var gear: Int = 4) {
    fun applySpeed(increment: Int) {
        this.speed += speed
    }

    fun applyBreak(decrement: Int) {
        this.speed -= decrement
    }

    open fun printDescription(){
        println("$type is in gear $gear with a cadence of $cadence travelling at a speed of $speed km/H")
    }
}

class MountainBike(
    type: String,
    speed: Int,
    cadence: Int,
    var seatHeight: Int,  // in inches...
    gear: Int = 7
) : Bicycle(type, speed, cadence, gear) {

    companion object{
        private var colorList = arrayListOf("Blue", "Black", "Red", "Yellow", "Green", "White", "Purple")

        fun getColorList() {
            for (color in colorList){
                println(color)
            }
        }
    }

    override fun printDescription(){
        super.printDescription()
        println("The Mountain Bike has seat height of $seatHeight inch")
    }
}

class RoadBike(
    type: String,
    speed: Int,
    cadence: Int,
    var tireWidth: Int, // in centimeters
    gear: Int = 5
) : Bicycle(type, speed, cadence, gear) {

    override fun printDescription() {
        super.printDescription()
        println("The Road Bike has tire width of $tireWidth cm")
    }
}