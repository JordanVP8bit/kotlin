fun main() {
    var sum = 0
    var number: Int? = null
    while(number == null) {
        println("Enter a positive number")
        number = readln()?.toIntOrNull()
    }
    if (number != null && number > 0) {
        for (i in 1..number) {
            sum += i
        }
        println("The sum of # from 1 to $number is: $sum")
    } else {
        println("Please enter a valid number please")
    }
}