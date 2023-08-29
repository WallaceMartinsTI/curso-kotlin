package inheritance

fun main() {
    val p1 = Point2D(2.0, 3.0)
    val p2 = Point3D(2.0, 3.0, 4.0)
}

open class Point2D(
    val x: Double,
    val y: Double
) {

}

class Point3D(x: Double, y: Double, val z: Double) : Point2D(x, y) {

}