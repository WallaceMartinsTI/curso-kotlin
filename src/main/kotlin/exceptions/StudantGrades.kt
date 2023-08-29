package exceptions

import java.lang.IllegalArgumentException

fun main() {
    val avg = StudantGrades()
        .add(-3.0)
        .add(5.5)
        .add(12.0)
        .average()

    println(avg)
}

class StudantGrades {
    private var sum: Double = 0.0
    private var numberOfGrades: Int = 0

    fun add(grade: Double): StudantGrades {
        //if (grade !in 0.0..10.0) {
        //  throw IllegalArgumentException("Invalid grade")
        //}

        require(grade in 0.0..10.0) { "Grade $grade is not valid" }

        sum += grade
        numberOfGrades++
        return this
    }

    fun average(): Double {
        return sum / numberOfGrades
    }
}