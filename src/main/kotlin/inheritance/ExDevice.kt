package inheritance

fun main() {
    val tv1 = TV("Tv TCL")
    val tv2 = TV("Tv LG")

    val t1 = Telephone("Xiaomi Redmi Note 8")
    val t2 = Telephone("iPhone 12 Pro Max")

    tv1.turnOn()
    tv1.turnOf()
    tv2.turnOn()
    tv2.turnOf()

    t1.turnOn()
    t1.turnOf()
    t2.turnOn()
    t2.turnOf()
}

abstract class Device(val name: String) {
    fun turnOn() {
        println("O dispositivo $name está LIGADO!")
    }

    fun turnOf() {
        println("O dispositivo $name está DESLIGADO!")
    }
}

class TV(name: String) : Device(name) {}

class Telephone(name: String) : Device(name) {}