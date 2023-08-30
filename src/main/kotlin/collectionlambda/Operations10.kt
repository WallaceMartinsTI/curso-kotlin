package collectionlambda

fun main() {
    val existsAge = Person
        .data()
        //.any { it.age == 19 }
        //.all { it.age == 19 }
        .none { it.age == 19 }

    println(existsAge)
}