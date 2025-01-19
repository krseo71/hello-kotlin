/**
 * 3. 함수
 */

fun main(args: Array<String>) {
    printStudentInfo("tom", 20)
//    Student Name : tom
//    Student Age : 20
//    Student Name and Age: tom20

    println(addNumber(10, 20))
    // 30
}

/**
 * function basic structure
 *
 * fun FUNCTION_NAME (PARAMETER) : RETURN_TYPE {
 * // CODES TO RETURN
 * }
 */

fun printStudentInfo(name: String, age: Int): Unit { // return값이 없는 함수, Unit 생략 가능
//    println("Student Name : " + name)
    println("Student Name : $name") // 스트링 템플릿 적용 $변수명, 계
//    println("Student Age : " + age)
    println("Student Age : $age")
    println("Student Name and Age: ${name + age}") // 스트링 템플릿 계산이 필요한 경우 ${변수명 + 변수명}

}

fun addNumber(n1: Int, n2: Int): Int { // return 값 Int
    return n1 + n2
}