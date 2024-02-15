fun main() {
    println("How many friends do you have?")
    print("# of friends:")
    val friendcount = readln()

    if (friendcount < 500.toString()) {
        println("You seem like a cat person")
        println("Buy Cat Food At 20% Off!")
    } else {
        println("You seem like a dog person")
        println("Adopt a Dog Today!")
    }
}
