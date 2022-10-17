import java.io.File

fun main(args: Array<String>) {
    val file = File("src/file.txt")
// manually close the resource
//    val reader = file.reader()
//    val lines = reader.readLines()  // do not use for huge files
//    println(lines)
//    reader.close()

// Automatic resource closers longer way
//    file.reader().use { inputStreamReader ->
//        { inputStreamReader.forEachLine { println(it)} }
//    }

// Automatic resource closers shorter way
    file.reader().forEachLine { println(it) }
}