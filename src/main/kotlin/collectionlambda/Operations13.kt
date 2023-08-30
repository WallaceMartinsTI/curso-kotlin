package collectionlambda

fun main() {
    Person
        .data()
        .associateBy { it.name }
        .forEach { (n, p) -> println("$n => $p") }
}