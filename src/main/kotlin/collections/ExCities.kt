package collections

fun main() {

    val cities = listOf("Londres", "Paris", "Lisboa", "Londres", "Roma", "Roma", "Berlim", "Madri", "Lisboa")

    println(cities)

    val uniqueCities = cities.toSet()
    println(uniqueCities)

    println(uniqueCities.size)
}