package lambda

fun main() {
    val x = 10

    val r = runIfTrue(x > 5) {
        println("Code executed!")
        x
    }

    println(r)
}

fun runIfTrue(condition: Boolean, code: () -> Any?): Any? {
    return if (condition) {
        code()
    } else {
        null
    }
}