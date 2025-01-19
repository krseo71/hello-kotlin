/**
 * 데이터 클래스
 */
fun main() {
    val memo = Memo("Go to grocery", "Eggs, Milk, Pork", false)

    println(memo.toString()) // Memo(title=Go to grocery, content=Eggs, Milk, Pork, isDone=false)
    println(memo.title) // Go to grocery
    val memo2 = memo.copy("Go to home") // 선언 해준 것만 변경되고 나머지는 복사
    println(memo2.toString()) // Memo(title=Go to home, content=Eggs, Milk, Pork, isDone=false)
}

// 주 생성자를 반드시 구현 해줘야 한다.
// 데이터 클래스를 사용하면 기본적으로 데이터를 저장하고 보관하고 사용하는데 필요한 함수를 자동으로 생성해준다.
data class Memo(val title: String, val content: String, var isDone: Boolean)