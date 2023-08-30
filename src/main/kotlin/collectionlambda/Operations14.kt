package collectionlambda

fun main() {
    Person
        .data()
        .groupBy({ it.name[0] }, { it.name })
        .forEach { (k, v) -> println("$k -> $v") }
}