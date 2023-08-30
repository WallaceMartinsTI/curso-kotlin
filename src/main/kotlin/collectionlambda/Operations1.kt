package collectionlambda

fun main() {
    //val people = Person.data()
    //val people2 = people.filter { it.age >= 18 }

    Person
        .data()
        .filter { it.age >= 18 }
        .forEachIndexed { i, p -> println("${i + 1}. $p") }
}