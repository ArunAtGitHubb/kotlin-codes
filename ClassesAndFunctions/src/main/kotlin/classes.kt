fun main(args: Array<String>) {
    val car1 = Car("Tesla", "g10", 2020)
    val car3 = Car("Tesla", "g10", 2020)
    val car2 = Car("BMW", "w3", 2007)
    println(car3 == car1)
    println(car2)
}

data class Car(private val company: String, private val model: String, private val year: Int){
    // In this class toString and equals functions are already override
    // Also if we want to override as our way it is also possible
    override fun toString(): String{
        // default would be "Car(company=$company, model=$model, year=$year)"
        return "Car => company: $company, model: $model, year: $year"
    }
}

//class example constructor(company: String, model: String, year: Int){
// long way to create class
//}

//class example constructor(company: String, model: String, year: Int){
// long way to create and initialize members
/*
 var company: String
 var model: String
 year: Int
     init{
     this.company = company
     this.model = model
     this.year = year
     }
*/
//}


//class Car(private val company: String, private val model: String, private val year: Int){
//    override fun equals(other: Any?): Boolean {
//        if(other is Car){
//            return (other.company === this.company && other.model === this.model && other.year == this.year)
//        }
//        return false;
//    }
//
//    override fun toString(): String {
//        return "company => $company, model: $model, year: $year"
//    }
//}
