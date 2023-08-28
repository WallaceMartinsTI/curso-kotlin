package functions

fun main() {
    //println("Aulas separadas nas funções!")

    test()
}

fun sayHello() {
    println("Hi! Hello!")
}

// função privada, apenas este arquivo
// tera acesso a função
private fun privateFunc() {
    println("Esta é uma função privada!")
}

// function with params
private fun sayHelloParam(name: String) {
    println("Hi, $name!")
}

// function with multiples params
private fun moreParams(name: String, temperature: Int) {
    println("Hi, $name! Temperature is $temperature degress.")
}

// retornando valores de função
private fun calculate(a: Int, b: Int): Int {
    return a + b
}

// exercício calcular idade do cachorro
private fun calculatDogAge(age: Double): Double {
    return age * 7
}

// valores padrão em parâmetros
private fun greeting(name: String, message: String = "") {
    println("Hi, $name! $message")
}

// usando funções como expressões
private fun multiply(a: Int, b: Int) = a * b

// exercício de string spacing
private fun spacing(str: String, isUpperCase: Boolean = false): String {
    var sb = StringBuilder()

    for (c in str) {
        sb.append("$c ")
    }

    val r = sb.toString()

    return if (isUpperCase) {
        r.uppercase()
    } else {
        r
    }
}

fun test() {
    // nomeando parametros da função
    calculate(b = 2, a = 3)

    //println(calculatDogAge(readln().toDouble()))

    //greeting("Jhonas", "Tudo bem?")

    println(spacing("Oi, tudo bem?", true))
}