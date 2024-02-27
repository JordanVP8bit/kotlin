fun main() {
    val sales = IntArray(size = 5)

    for(i in 0 until 5) {
        println("Enter the sales for store ${i +1}:")
        sales[i] = readLine()?.toIntOrNull() ?:0
    }

    println("\nSales bar chart")
    for(i in 0 until 5) {
        print("Store ${i + 1}:")
        repeat(times = sales[i] / 10) {
         print("*")
        }
    }
}