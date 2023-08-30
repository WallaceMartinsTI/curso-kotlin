package collectionlambda

fun main() {
    val maxName = Person
        .data()
        .map { it.name }
        .maxBy { it.length }

    println(maxName)

    val minAge = Person
        .data()
        .minOf { it.age }

    println(minAge)
}