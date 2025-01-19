fun main(args: Array<String>) {
    // Lambda Expression

    // 익명함수
    val sayHello = fun() {
        println("Hello!")
    }
    sayHello()

    // 람다 식을 값처럼 다룰 수 있다는 것은 람다식 자체가 함수의 인수, 리턴값이 될 수 있다는 것
    // 첫번째 인수 어떤 자료형을 넣을것인지 정의
    // 화살표 다음 반환하는 형을 정의
    val squareNum: (Int) -> Int = { num -> num * num }
    val squareNum2 = { num: Int -> num * num }
    val squareNum3: (Int) -> (Int) = {it * it} // it

    println(squareNum(10))
    println(squareNum2(10))
    println(squareNum3(10))

    // 람다식 인수로 활용
    fun invokeLambda(lambda: (Int) -> Boolean): Boolean {
        return lambda(5)
    }

    val falseValue = invokeLambda({num -> num == 10})
    println(falseValue)
    val trueValue = invokeLambda({num -> num < 10})
    println(trueValue)

    // 인수로 활용되는 람다식의 여러 형태
    invokeLambda({it < 10})
    invokeLambda(){it < 10}
    invokeLambda{it < 10}
}