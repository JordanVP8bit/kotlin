// VarAndVal/Task1.kt
package varAndValExercise1qq

fun main() {
    println("What day is it today?")
    val day = readLine()!!
    println(day)

    val first = "Jordan"
    val last = "Pham"
    var age = 17
    println("Hello, World! My name is $first $last, and I'm $age years old.")
    println("Did I tell you that my first name is $first?")
    age = age - 5
    println("And would you believe I'm $age years old?")
}