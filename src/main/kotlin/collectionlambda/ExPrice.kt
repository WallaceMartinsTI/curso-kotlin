package collectionlambda

fun main() {
    val products = mapOf(
        "Alface" to 2.5,
        "Arroz" to 6.9,
        "Banana" to 4.8,
        "Sal" to 2.4
    )

    // R: 1
    println(
        products
            .map { it.value }
            .max()
    )

    // R: 2
    println(
        products
            .minBy { it.value }
            .key
    )

    // R: 3
    products
        .filter { it.value < 5.0 }
        .keys
        .forEach { println(it) }
}