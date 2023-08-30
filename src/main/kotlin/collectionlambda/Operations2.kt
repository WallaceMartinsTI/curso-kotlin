package collectionlambda

fun main() {
    Person
        .data()
        .map {it.name}
        .forEach { println(it) }
}