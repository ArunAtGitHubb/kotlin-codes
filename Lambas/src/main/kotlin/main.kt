import java.util.*

fun main() {
    run {
        println("I'm inside run block (lambda)")
    }

    val personList = listOf(
        Person("Arun", 19),
        Person("Appa", 44),
        Person("Amma", 38),
        Person("Aish", 16)
    )

    personList.forEach { println(it) }

    print("Available methods:\n" + METHODS.availableOptions())

    var option = Scanner(System.`in`)
    var selectedOption: METHODS
    when(option.nextInt()){
        1 -> selectedOption = METHODS.APPLY
        2 -> selectedOption = METHODS.WITH
        else -> selectedOption = METHODS.DEFAULT
    }
    println(selectedOption.toString() +": " + count100(selectedOption))
}

fun count100(method: METHODS): StringBuilder {
    when (method) {
        METHODS.DEFAULT -> {
            var numbers = StringBuilder()
            for (i in 0..99 step 5) {
                numbers.append(i)
                numbers.append(", ")
            }
            numbers.append("100")
            return numbers
        }
        METHODS.WITH -> {
            return with(StringBuilder()) {
                for (i in 0..99 step 5) {
                    this.append(i)
                    this.append(", ")
                }
                append("100") // we can also omit the `this` keyword
            }
        }
        METHODS.APPLY -> {
            return StringBuilder().apply {
                for (i in 0..99 step 5) {
                    append(i)
                    append(", ")
                }
                this.append("100")
            }
        }
    }
}

