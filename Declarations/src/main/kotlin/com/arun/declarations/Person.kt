package com.arun.declarations

class Person(private var name: String, private val id: Int) {

    fun getPersonName() : String{
        return name
    }

    fun getPersonId(): Int {
        return id
    }

    override fun equals(other: Any?): Boolean {
        if(other is Person){
            return name == other.getPersonName() && id == other.getPersonId()
        }
        return false
    }

    override fun toString(): String{
        return "$name id -> $id"
    }

}