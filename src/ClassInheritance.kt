/**
 * 클래스 상속
 */

fun main() {
    val korea = Korea("Republic of Korea", "Seoul", "Korean")
    korea.singNationalAnthem()
//    Start singing
//    Sing korea national anthem

    val usa = USA("United States of America", "Washington", "English")
    usa.singNationalAnthem()
//    Start singing
//    Sing korea national anthem

    korea.printLanguage()
//    Language: Korean
    usa.printLanguage()
//    Language: English
}

// 기본적으로 모든 클래스는 상속이 불가능하기 때문에 open 이라는 키워드를 꼭 붙여야 한다.
open class Country(val fullName: String, val capital: String, val language: String) {
    fun printFullName() {
        println("Full Name: $fullName")
    }
    fun printCaptital() {
        println("Capital: $capital")
    }
    fun printLanguage() {
        println("Language: $language")
    }
    open fun singNationalAnthem() {
        println("Start singing")
    }
}

class Korea(fullName: String, capital: String, language: String): Country(fullName, capital, language) {
    override fun singNationalAnthem() { // 오버라이딩: 부모 클래스에서 어떤 함수를 실행을 하는데 이 자식 클래스에서 각각 다르게 함수가 실행이 되는 것
        super.singNationalAnthem() // Start singing
        println("Sing korea national anthem")
    }
}

class USA(fullName: String, capital: String, language: String): Country(fullName, capital, language) {
    override fun singNationalAnthem() { // 오버라이딩: 부모 클래스에서 어떤 함수를 실행을 하는데 이 자식 클래스에서 각각 다르게 함수가 실행이 되는 것
        super.singNationalAnthem() // Start singing
        println("Sing korea national anthem")
    }
}
