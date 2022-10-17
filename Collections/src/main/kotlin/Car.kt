// we can also make class as data class we are able to de-structure the class
// without add componentN() function
// but accessing elements must be public
data class Car(val color: String, val company: String) {

//    operator fun component1() = color  // we are able to pass private elements'
//    operator fun component2() = company
}