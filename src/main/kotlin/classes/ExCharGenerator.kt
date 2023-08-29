package classes

fun main() {
    val g = CharGenerator('A', 'Z')
    println(g.next())
    println(g.next())
    println(g.next())
}

class CharGenerator(val min: Char, val max: Char) {
    fun next() = (min..max).random()
}