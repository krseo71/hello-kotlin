/**
 * 반복분
 */

fun main(args: Array<String>) {
//    [+] Range Class 범위 클래스
//    IntRange, LongRange, CharRange
    val numRange: IntRange = 1..10
    println(numRange.contains(3)) // true
    println(numRange.contains(20)) // false

    val charRange: CharRange = 'a'..'e'
    println(charRange.contains('b')) // true
    println(charRange.contains('z')) // false

    // 1. For
    for (i in 1..5) {
        println(i) // 1 ~ 5 까지 반복 출력
    }
    for (i in 1 until 10) {
        println(i) // 1 ~ 9 까지
    }
    for (i in 10 downTo 1) {
        println(i) // 10 부터 1까지
    }

    for (i in 1..10 step 2) {
        println(i) //1부터 +2 씩 (1,3,5,7,9)
    }

    // 2. While 주어진 조건이 true 일때 계속해서 반복
    var num = 1
    while (num < 5) {
        println("current number: $num")
        num++
//        current number: 1
//        current number: 2
//        current number: 3
//        current number: 4
//        num이 5가 되는 순간 조건이 false가 되어 반복문 탈출
    }

    num = 6
    do { // while문의 조건과 무관하게 do 안의 코드를 먼저 실행해 준다.
        print("do while current number: ${num}")
//        do while current number: 6
//        num = 6이므로 while문의 조건은 false이나 무조건 한번 실행
        num++
    } while (num < 5)

}