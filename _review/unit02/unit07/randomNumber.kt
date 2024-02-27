import kotlin.random.Random

fun main() {
    val random = Random.nextInt(1, 10)
    var guess: Int?

    println("Guess a number between 1 - 10")

    do {
        print("Enter your guess")
        guess = readLine()?.toIntOrNull()
        if (guess != null) {
            if (guess < random) {
                println("Too low, Try again")
            } else if (guess > random) {
                println("Too high, Try again")
            } else {
                println("Congratuluations! You guessed the right number: $random")
            }
        } else {
            println("Please enter valid number")
        }

    } while (guess != random)
}