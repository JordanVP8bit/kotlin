class Car(var brand: String, var model: String, var year: Int, ) {
    fun drive() {
        println("Wrooom")
    }
    
}

fun main() {
    val c1 = Car("Ford", "Mustang", 1969)
    val c2 = Car("Tesla", "Model S", 2020)
    val c3 = Car("BMW", "X5", 1999)
    
    println(c1.brand)
    println(c1.model)
    println(c1.year)

    println(c1.brand)
    println(c2.brand)
    println(c3.brand)

    println(c3.brand)
    c3.drive()
}