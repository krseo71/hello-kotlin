fun main() {
    val car = Car()

    car.drive() // Car is moving
    car.stop() // Car is stopping
    car.destroy()
    // Vehicle is destoryed
    // The vehicle is car

    val bike = Bike()
    bike.drive()  // Bike is driving
    bike.stop() // Bike is stopping
}

interface Vehicle {
    fun drive()
    fun stop()

    // default 메서드는 구현하는 클래스에서  따로구현을 하지않아도 된다.
    fun destroy() { println("Vehicle is destoryed") }
}
// 클래스를 상속받는 것과는 달리 인터페이스는 여러 개를 구현할 수 있다.
interface Color {
    fun showMeColor()
}

class Car: Vehicle, Color {
    override fun drive() {
        println("Car is moving")
    }

    override fun stop() {
        println("Car is stopping")
    }

    override fun destroy() {
        super.destroy()
        println("The vehicle is car")
    }

    override fun showMeColor() {
        println("Red color")
    }
}

class Bike: Vehicle {
    override fun drive() {
        println("Bike is driving")
    }

    override fun stop() {
        println("Bike is stopping")
    }

}