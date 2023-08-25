package firststeps

import java.util.Scanner

fun main() {
    test()
}

fun class_intro() {
    println("Hello")
    println("World!")
}

fun class_variables() {
    //var counter: Int
    //counter = 10
    //var counter: Int = 10

    var counter = 10
    counter = 5

    val counter2 = 10
    //counter2 = 5      -> error because VAL cannot be reassigned
}

fun class_integer() {
    /*
        Byte: 1 byte - 8 bits
        Short: 2 byte - 16 bits
        Int: 4 bytes - 32 bits
        Long: 8 bytes - 64 bits
    */

    val i1 = 10
    val i2: Int = 10
    val i3: Int

    val l1 = 103498
}

fun class_decimals() {
    /*
        Float: 4 bytes - 32 bits
        Double: 8 bytes - 64 bits
    */

    val d1 = 14.5
    val d2: Double = 5.0
    val f1 = 14.5F
    val f2: Float = 32.5F
}

fun class_data_conversion() {
    val i1 = 10
    val d1 = i1.toDouble()
    println(d1)

    val l1 = i1.toLong()
    println(l1)

    val d2 = 10.34
    val i2 = d2.toInt()
    println(i2)

    val i3 = 2000
    val b1 = i3.toByte()
    println(b1)
}

fun class_unsigned_numbers() {
    /*
        Byte -> UByte
        Short -> UShort
        Int -> UInt
        Long -> ULong
    */

    val x = 100U
    val y = 100UL

    val x2 = x.toInt()
    val y2 = y.toDouble()

    val x3 = -20
    val x4 = x3.toUInt()
    println(x4)
}

fun class_boolean() {
    val b1: Boolean = true
    val b2 = false
}

fun class_char() {
    val c: Char = 'A'
    println(c)
    println(c.code)

    val i = 65
    println(i.toChar())

    val c2 = '1'
    println(c2.isDigit())
    println(c2.isUpperCase())
    println(c2.digitToInt())
}

fun class_string() {
    val s1 = "abc"
    val s2 = "def"

    //val s1s2 = "Soma: " + (s1 + s2)
    val s1s2 = "Soma: '$s1$s2'. O tamanho é : ${(s1 + s2).length}"

    println(s1s2)
}

fun class_string_literal1() {
    /*
        O rato roeu
        a $roupa do
        rei de "Roma".
    */

    val s1 = "O rato roeu\na \$roupa do\nrei de \"Roma\"."

    println(s1)
}

fun class_string_literal2() {
    /*
        O rato roeu
        a $roupa do
        rei de "Roma".
    */

    val s1 = "O rato roeu\na \$roupa do\nrei de \"Roma\"."

    val s2 = """
        O rato roeu
        a roupa do
        rei de "Roma".
    """.trimIndent()

    println(s1)
    println()
    println(s2)
}

// CONST modifier
const val msg = "Hi!"
const val x = 10
fun class_const() {
    println(msg)
    println(x)
}

fun class_get_data_by_keyboard_readln() {
    print("Digite o seu nome: ")
    val name = readln()

    println("Seu nome invertido é: ${name.reversed()}")
}

fun class_get_data_by_keyboard_scanner() {
    //print("> ")
    //val n1 = readln().toInt()

    //print("> ")
    //val n2 = readln().toInt()

    //println("Result: ${n1 + n2}")

    val scanner = Scanner(System.`in`)
    print("> ")
    val n1 = scanner.nextInt()

    print("> ")
    val n2 = scanner.nextInt()

    println("Result: ${n1 + n2}")
}

fun class_ex01_user_data() {
    val scanner = Scanner(System.`in`)
    println("Por favor informe os seguintes dados:")
    print("Nome: ")
    val name = readln()
    print("Idade: ")
    val age = scanner.nextInt()
    print("Peso: ")
    val weight = readln().toDouble()

    println("Olá $name, você tem $age anos e está pesando $weight Kg")
}

fun class_ex02_trunc_value() {
    print("Informe um valor: ")
    println(readln().toDouble().toInt())
}

fun class_arithmetic_operators() {
    println(10 + 5)
    println(12 - 7)
    println(3 * 2)
    println(15 / 3)
    println(14 % 3)
}

fun class_data_conversion_in_arithmetic_operations() {
    val a = 10.0
    val b = 3

    println(a / b)

    val c = 30L
    val d = 20

    println(c * d)

    println(10 / (3).toDouble())
}

fun class_relational_operators() {
    println(10 == 10)
    println(10 != 7)
    println(5 > 2)
    println(5 < 2)
    println(5 >= 5)
    println(5 <= 5)
}

fun class_logic_operators() {
    // Tabela-Verdade

    // AND
    println("T AND T ${true && true}")
    println("T AND F ${true && false}")
    println("F AND T ${false && true}")
    println("F AND F ${false && false}")

    println()

    // OR
    println("T AND T ${true || true}")
    println("T AND F ${true || false}")
    println("F AND T ${false || true}")
    println("F AND F ${false || false}")

    println()

    // NOT
    println("NOT F ${!false}")
    println("NOT F ${!true}")
}

fun class_assignment_operators() {
    var x = 5;
    x += 2 // x = x + 2
    println(x)

    x -= 2 // x = x - 2
    println(x)

    x *= 2 // x = x * 2
    println(x)

    x /= 3 // x = x / 3
    println(x)

    x++ // x = x + 1
    println(x)

    x-- // x = x - 1
    println(x)
}

fun class_pre_pos_increment_decrement() {
    var x = 8
    println(++x)
    println(x)

    var y = 8
    println(++y)
    println(y)
}

fun class_operators_precedence() {
    val exp = 5 + 4 - 3 * 2 * (1 + 1) / 3

    // 5 + 4 - 3 * 2 * 2 / 3
    // 5 + 4 - 6 * 2 / 3
    // 5 + 4 - 12 / 3
    // 5 + 4 - 4
    // 9 - 4
    // 5

    println(exp)

    //--------------------

    val exp2 = true && false || true && !false

    // T && F || T && T
    // F || T
    // T

    println(exp2)
}

fun class_ex03_expression_with_mix_operators01() {
    val exp = (5 + 3) * 2 < 30 / 2 || !(5 - 1 <= 8 % 3)

    // 8 * 2 < 30 / 2 || !(5 - 1 <= 2)
    // 10 < 30 / 2 || !(4 <= 2)
    // 10 < 15 || !(false)
    // false || true
    // true

    println(exp)
}

fun class_ex04_expression_with_mix_operators02() {
    val exp = !(2 * 4 >= 16 / 2 && 5 == 4 + 1)

    // !(8 >= 16 / 2 && 5 == 5)
    // !(8 >= 8 && true)
    // !(true && true)
    // false

    println(exp)
}

fun test() {

}
