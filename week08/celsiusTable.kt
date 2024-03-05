fun main() {
    println("Fahrenheit   Celsius")
    println("---------------------")
    for (fahrenheit in 0..20) {
        val celsius = celsius(fahrenheit)
        println("$fahrenheit°F         $celsius°C")
    }
}

fun celsius(fahrenheit: Int): Double {
    val celsius = 5.0 / 9.0 * (fahrenheit - 32)
    return celsius
}
