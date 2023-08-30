package collectionlambda

fun main() {
    val count = Person
        .data()
        .filter { it.name.uppercase().startsWith("R") }
        .sumOf { it.age }

    println(count)
}