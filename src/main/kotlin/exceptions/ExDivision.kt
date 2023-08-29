package exceptions

fun main() {
    println(division(10, 5))
    println(division(10, 0))
}

fun division(a: Int, b: Int): Int {
    val result = try {
        a / b
    } catch(e: Exception) {
        0
    }

    return result;
}

fun div(n1: Int, n2: Int): Int {
    return try {
        n1 / n2
    } catch (_: ArithmeticException) {
        0
    }
}