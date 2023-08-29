package polimorphism

import kotlin.jvm.internal.Intrinsics.Kotlin

fun main() {
    val p = Programmer()
    p.work()

    val t = Teacher()
    t.work()

    val k: Programmer = Programmer()
    k.work()

    val b: KotlinProgrammer = KotlinProgrammer()
    b.work()

    var c: Programmer = KotlinProgrammer()
    c.work()

    c = Programmer()
    c.work()

    var d: Programmer = KotlinProgrammer()
    var e: Programmer = Programmer()

    d.work()
    e.work()
}

abstract class Employee {

    abstract fun work()
}

open class Programmer : Employee() {
    override fun work() {
        println("Programmer working...")
    }
}

class KotlinProgrammer : Programmer() {
    override fun work() {
        println("Kotlin programmer working...")
    }
}

class Teacher : Employee() {
    override fun work() {
        println("Teacher working...")
    }
}