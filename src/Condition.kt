/**
 * 조건문
 */

fun main() {
    // 1. If
    val examResult = isPass(70)
    println("ExamResult: $examResult") // true

    val is3Contained = is3Contained(1..10)
    println("is3Contained: $is3Contained") // true

    // 2. When
    val myGrade = getGrade(80)
    println("myGrade: $myGrade") // B
}

fun isPass(examScore: Int): Boolean {
    if (examScore >= 60) {
        return true
    } else {
        return false
    }
}
fun is3Contained(intRange: IntRange): Boolean {
    if (intRange.contains(3)) {
        return true
    } else {
        return false
    }
}

fun getGrade(score: Int): Char {
    when (score) {
        in 0..40 -> return 'D'
        in 41..70 -> return 'C'
        in 71..90 -> return 'B'
        in 90..100 -> return 'A'
        else -> return 'Z'
    }
}
