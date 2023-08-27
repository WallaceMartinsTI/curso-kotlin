package selection

fun main() {
    //println("Aulas separadas nas funções!")

    test()
}

fun class_if_structure() {
    val temp = 10

    if (temp > 22) {
        println("Está calor!")
        println("A temperatura é $temp")
    }

    println("Fim do programa!")
}

fun class_if_else_structure() {
    val temp = 10

    if (temp > 22) {
        println("Está calor")
    } else {
        println("Está frio!")
    }

    println("Fim do programa!")
}

fun class_ex01_num_below_10() {
    print("Informe um valor numérico: ")

    var number = readln().toDouble()

    if (number > 10) {
        number = 10.0
    }

    val result = (number * number).toInt()

    println("O resultado é: $result")
}

fun class_ex02_even_or_odd() {
    println("Informe um número inteiro para saber se é par ou ìmpar")
    print("Número: ")

    val number = readln().toInt()

    if (number % 2 == 0) {
        println("O número informado é PAR!")
    } else {
        println("O número informado é ÌMPAR")
    }

    println("Fim do programa!")
}

fun class_nested_if_else() {
    val v = 10
    if (v > 0) {
        println("POSITIVO")
    } else if (v < 0) {
        println("NEGATIVO")
    } else {
        println("ZERO")
    }
}

fun class_ex03_sort_person_by_age() {
    print("Informe a Idade: ")
    val age = readln().toInt()

    if (age < 0 || age > 120) {
        print("Idade Inválida!")
        return;
    }

    print("Identificados um")
    if (age >= 0 && age <= 12) {
        print("a CRIANÇA!")
    } else if (age <= 17) {
        print(" ADOLESCENTE!")
    } else if (age <= 65) {
        print(" ADULTO!")
    } else {
        print(" SÊNIOR!")
    }
}

fun class_if_as_returned_value() {
    val n = 10

    val r = if (n % 2 == 0) {
        "PAR"
    } else {
        "ÌMPAR"
    }

    println(r)
}

fun class_when_structure() {
    val x = 20

    when (x) {
        10 -> println("É 10")
        20 -> println("É 20")
        30 -> println("É 30")
        else -> println("Desconhecido")
    }

    when (x) {
        in 0..10 -> println("Entre 0 e 10")
        in 11..30 -> println("Entre 11 e 30")
        else -> println("Outro intervalo")
    }

    when (x) {
        0, 2, 4, 6 -> println("PAR")
        else -> println("Desconhecido")
    }

    // Outro tipo de uso
    val y = 0
    when {
        y > 0 -> println("POSITIVO")
        y < 0 -> println("NEGATIVO")
        else -> println("ZERO")
    }

    val s = when {
        y > 0 -> "POSITIVO"
        y < 0 -> "NEGATIVO"
        else -> "ZERO"
    }
    println(s)
}

fun class_ex04_implement_a_calculator() {
    print("1 valor: ")
    val value1 = readln().toDouble()

    print("Operador (+, -, *, /): ")
    val operator = readln()[0]

    print("2 valor: ")
    val value2 = readln().toDouble()

    val result = when (operator) {
        '+' -> value1 + value2
        '-' -> value1 - value2
        '*' -> value1 * value2
        '/' -> value1 / value2
        else -> 0
    }

    println(result)
}

fun class_repetition_structures() {
// while
    var x = 0

    while (x <= 10) {
        print("$x ")
        x++
    }

    println()

    // do ... while
    val y = 10
    while(y < 5) {
        print("$y")
    }

    do {
        print("$y")
    } while (y < 5)
}
fun test() {
    println("Informe um número para ver sua Tabuada! (Tabuada de Multiplicação!")
    print("Número: ")

    val number = readln().toInt()
    var initial = 1

    while (initial <= 10) {
        println("$number x $initial = ${number * initial}")
        initial++
    }

}





