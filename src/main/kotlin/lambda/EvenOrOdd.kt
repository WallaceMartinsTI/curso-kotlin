package lambda

fun main() {
    val f: (Int) -> Boolean = { n: Int -> n % 2 == 0 }
    val f2 = { n: Int -> n % 2 == 0 }   // Omitir tipo de f2
    val f3: (Int) -> Boolean = { n -> n % 2 == 0 }  // Omitir tipo do parâmetro

    println(f(2))
    println(f2(3))
}