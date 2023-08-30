package collectionlambda

fun main() {
    Person
        .data()
        .map { it.age }
        .distinct()
        .sorted()
        .forEach { println(it) }
}