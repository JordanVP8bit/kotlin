fun main() {
    var sum = 0
    var number: Int

    do {
        println("Enter a positive nonzero integer:")
        number = readLine()?.toIntOrNull() ?: 0
    } while (number <= 0)

    for (i in 1..number) {
        sum += i
    }

    println("The sum of numbers from 1 to $number is: $sum")
}
