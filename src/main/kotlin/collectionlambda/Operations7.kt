package collectionlambda

fun main() {
    val sum = Person
        .data()
        .map { it.age }
        .reduce { acc, age -> acc + age }

    println(sum)
}