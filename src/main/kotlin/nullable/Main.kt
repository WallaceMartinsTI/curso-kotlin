package nullable

fun main() {
   println("Aulas separadas nas funções!")
}

fun class_intro() {
    var n: Int? = 10
    n = 20
    n = 30
    n = null

    print(n)
}

fun class_safe_calls() {
    val s1: String? = null
    println(s1)

    val s2 = s1?.uppercase()
    println(s2)

    val s3 = s2?.reversed()
    println(s3)

    val l = s2?.length
    println(l)
}

fun class_smart_cast() {
    var s1: String? = "abcde"
    //val s1: String? = null

    if (s1 != null) {
        println(s1)

        val s2 = s1.uppercase()
        println(s2)

        val s3 = s2.reversed()
        println(s3)

        val l = s2.length
        println(l)
    }
}

fun class_elvis_operator() {
    val value: Int? = 10

    //val value2 = if (value != null) value else 0
    //println(value2)

    val value2 = value ?: 0
}

fun class_not_null_assertion() {
    val s: String = "abcde"
    val i = s!!.reversed()
    println(i)
    // Porém, se receber nulo, vai dar o
    // erro de NullPointerException
}

fun class_ex07_password_mask() {
    val password: String? = null

    val defaultPassword = "1234"

    val mask = "".padEnd((password ?: defaultPassword).length, '*')

    println(password)
    println(mask)
}

fun class_ex08_number_inputed_transform() {
    //println(readln().toIntOrNull()?: 2.times(2).times(2).minus(10))
    println(
        readln()
            .toIntOrNull()
            ?: 2
                .times(2)
                .times(2)
                .minus(10))
}