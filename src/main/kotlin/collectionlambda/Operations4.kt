package collectionlambda

fun main() {

    Person
        .data()
        .map { it.name }
        //.randomOrNull()
        .shuffled()
        .take(3)
        .forEach { println(it) }
}