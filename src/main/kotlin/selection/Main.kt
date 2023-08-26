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
fun test() {
    val n = 10

    val r = if (n % 2 == 0) {
        "PAR"
    } else {
        "ÌMPAR"
    }

    println(r)
}
