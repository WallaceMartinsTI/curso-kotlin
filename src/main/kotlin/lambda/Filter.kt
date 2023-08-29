package lambda

fun main() {
    val s1 = "KsoAHda982daIOJdjsaJDSAd91jdasDS"

    val s2 = s1.filter { it.isDigit() }
    println(s2)

    val s3 = s1.filterIndexed { i, c ->
        val digit = c.isDigit()
        if (digit) {
            println("Found digit '$c' in position '$i'")
        }
        digit
    }

    println(s3)
}