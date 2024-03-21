class BankAccount(var AccountNumber: Int, var balance: Double, var owner: String){
    fun deposit(amount: Double) {
        balance += amount
    }
}

fun main(){
    val b1 = BankAccount(10293213, 1000.00, "Jordan Pham")
    b1.deposit(200.00)
}