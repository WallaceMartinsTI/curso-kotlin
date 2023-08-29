package polimorphism

fun main() {
    val vehicle = object : Vehicle {
        override fun drive() {
            print("Driving...")
        }
    }

    vehicle.drive()
}

interface Vehicle {
    fun drive()
}