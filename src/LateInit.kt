fun main(args: Array<String>){
    val name = "Tom"
    // lateinit -> var
    // 원시 자료형이 아닌것에만 사용 할 수 있다.
    lateinit var lunch: String
    lunch = "waffle"
    println(lunch)

    // lazy -> val
    val lazyBear: String by lazy {
        println("Bear is coming!")
        "bear"
    }
    println("First try : : : :")
    println(lazyBear)
    println("Second try : : : :")
    println(lazyBear)
    /**
     * 처음에 생성될때 초기화 되는 것이아니라 실제로 사용이 될때 { } 안의 레이지 구문이 실행이 되고 그 이후 부터는
     * 실행되지 않고 할당해 주었던 "bear" 가 출력됨을 알 수 있다.
     * First try : : : :
     * Bear is coming!
     * bear
     * Second try : : : :
     * bear
     */
}
