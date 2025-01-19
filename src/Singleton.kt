fun main(args: Array<String>){
    println(MyFirstObject.number) // 1
    MyFirstObject.sayHello() // Hello!

    println(Dinner.MyCompanionObject.MENU)
    Dinner.eatDinner()

}

object MyFirstObject {
    val number = 1
    fun sayHello() {
        println("Hello!")
    }
}

class Dinner {
    val lunch = "steak"

    // 클래스 안에 들어있는 오브젝트
    companion object MyCompanionObject { // companion object는 클래스 하나에 하나 밖에 있을수 없다
        val MENU = "pasta"
        fun eatDinner() {
            println("Today's Menu is $MENU")
        }
    }
}