open class Vehicle(var make: String, var modle: String, var year: Int){
    fun startengine(){
        println("Engine Started")
    }
}
class Car(make: String, model: String, year: Int) : Vehicle(make, model, year) {
     fun startEngine() {
        println("Car engine started")
    }
}

class Motorcycle(make: String, model: String, year: Int) : Vehicle(make, model, year) {
     fun startEngine() {
        println("Motorcycle engine started")
    }
}
fun main() {
    val v1 = Motorcycle("Kawasaki", "Ninja 400", 2014)
    v1.startengine()
    val v2 = Car("Toyota", "Tundra", 2006)
    v2.startengine()
}