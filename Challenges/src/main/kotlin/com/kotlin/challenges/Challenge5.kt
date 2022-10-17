package com.kotlin.challenges

import JavaCodes.Employee

fun main() {
    val employee = Employee("Thor", "Odin", 2009)
    println(employee)
    employee.setStartYear(2010)
    employee.setLast3Salary(floatArrayOf(100.99f, 300.99f, 700.10f))
    println(employee)
}