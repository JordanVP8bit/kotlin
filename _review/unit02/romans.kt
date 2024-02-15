fun main() {
    println("Enter a number between 1 and 10")
    var number = readln()!!
    var rom = number.toInt()

    if (rom == 1){
        println("Your Roman Numeral is I")
    } else if (rom == 2) {
        println("Your Roman Numeral is II")
    } else if (rom == 3) {
        println("Your Roman Numeral is III")
    } else if (rom == 4) {
        println("Your Roman Numeral is IV")
    } else if (rom == 5) {
        println("Your Roman Numeral is V")
    } else if (rom == 6) {
        println("Your Roman Numeral is VI")
    } else if (rom == 7) {
        println("Your Roman Numeral is VII")
    } else if (rom == 8) {
        println("Your Roman Numeral is VIII")
    } else if (rom == 9) {
        println("Your Roman Numeral is VIV")
    } else if (rom ==10) {
        println("Your Roman Numeral is X")
    } else if (rom >10) {
        println("That's too high!")
    } else if (rom<10) {
        println("That's too low!")
    }
    }
