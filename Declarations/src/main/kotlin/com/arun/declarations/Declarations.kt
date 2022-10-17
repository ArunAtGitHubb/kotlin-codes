package com.arun.declarations

typealias Persons = Set<Person>

fun main(args: Array<String>) {
    /*
    * In kotlin we can declare variable in two-way
        * Immutable way [val]
        * Mutable way   [var]
    */

//    Immutable way
    val num = 25  // explicit type declaration
//    num = 20  // cannot resign because it's immutable
    val num1: Int // implicit type declaration

//    Mutable way
    var num2 = 20
    num2 = 21

    // typealias

    val persons: Persons = setOf(
        Person("Arun", 1),
        Person("Appa", 2),
        Person("Amma", 3)
    )

    println(persons.size)
    persons.forEach() {
        println(it)
    }

    /// Referential and structural equality
    println("\nReferential and structural equality \n\t _________________________")

    val person1 = Person("Batman", 4)
    val person2 = Person("Captain", 5)
    val person3 = Person("Captain", 5)

    // i. Referential equality
    println("Referential equality")
    println(person1 === person2)
    println(person2 === person3)

    // ii. Structural equality
    println("Structural equality")
    println(person1 == person2)
    println(person2 == person3)

    // String templates
    println("\nString Templates \n  _____________")
    println("immutable num variable $num")
    println("mutable num2 variable $num2")
    println("The difference between $num and $num2 is ${num - num2}")
}
