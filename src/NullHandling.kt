fun main(args: Array<String>){
    // Nullable vs Non-Nullablee(Default)
//    var myName: String = null
    var myName: String = "Tom"
    println(myName.reversed()) // moT

    // Nullable ?
    var nullableMyName : String? = null
//    println(nullableMyName.reversed()) // 값을 할당해주어도 nullable이기 때문에 함수를 사용할 수 없게끔 언어차원에서 강제함

    // ?. 세이프 콜 연산자
    println(nullableMyName?.reversed())

    // ?: 엘비스 연산자
    val tom = nullableMyName?.reversed() ?: "Anonymous" // 엘비스 연산자: null일경우 "Anonymous"로 반환
    println("tom: $tom")

    // !! 확정 연산자
    nullableMyName = "Tom"
    println(nullableMyName!!.reversed())
}