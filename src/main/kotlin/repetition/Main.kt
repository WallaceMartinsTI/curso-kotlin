package repetition

fun main() {
    //println("Aulas separadas nas funções!")

    test()
}

fun class_repetition_structures() {
    // WHILE
    var x = 0

    while (x <= 10) {
        print("$x ")
        x++
    }

    println()

    // DO ... WHILE
    val y = 10
    while(y < 5) {
        print("$y")
    }

    do {
        print("$y")
    } while (y < 5)

    // FOR
    for (i in 0..10) {
        print("$i ")
    }

    println()

    for (i in 10 downTo 0 step 2) {
        print("$i ")
    }

    println()

    for (i in 10 until 100 step 10) {
        print("$i ")
    }

    // Tabuada com FOR
    val n = 5
    val t = 10
    for (x in 1..t) {
        println("$n x $x = ${n * x}")
    }
}

fun class_ex05_multiplication_table() {
    println("Informe um número para ver sua Tabuada! (Tabuada de Multiplicação!")
    print("Número: ")

    val number = readln().toInt()
    var initial = 1

    while (initial <= 10) {
        println("$number x $initial = ${number * initial}")
        initial++
    }
}

fun class_continue() {
    for (i in 0..10) {
        if (i % 2 == 0) {
            continue
        }

        print("$i ")
    }
}

fun class_break() {
    for (i in 0..10) {
        if (i == 5) {
            break
        }
        print("$i ")
    }
    println("FIM")
}

fun test() {

}