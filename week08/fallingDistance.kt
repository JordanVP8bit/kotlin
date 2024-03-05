fun main() {
    for (time in 1..10) {
        val distance = fallingDistance(time.toDouble())
        println("Time: $time seconds, Distance: $distance meters")
    }
}

fun fallingDistance(time: Double): Double {
    val g = 9.8

    val distance = 0.5 * g * time * time
    return distance
}
