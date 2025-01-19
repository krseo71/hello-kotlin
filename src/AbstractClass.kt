/**
 * 추상 클래스
 */
fun main() {
    val overwatch = Overwatch()

    overwatch.startGame() // Start Game
    overwatch.printGameName() // This is Overwatch
}

abstract class Game {
    fun startGame() {
        println("Start Game")
    }
    abstract fun printGameName() // 추상메서드는 구현부가 없다
}

class Overwatch: Game() {
    override fun printGameName() {
        // 추상클래스를 사용하면 자식클래스에서 반드시 구현하게끔 강제화한다.
        println("This is Overwatch")
    }
}

