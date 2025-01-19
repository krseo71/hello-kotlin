///**
// * 클래스
// */
//fun main(args: Array<String>) {
//    val car = Car("Red", "Volvo", 13) // Color: Red, Name: Volvo, Age: 13
//    val car2 = Car("Yellow", "Hyundai", 13) // Color: Yellow, Name: Hyundai, Age: 13
//
//
//    // init 함수 호출 후 보조 생성자 호출
//    val car3 = Car("Blue", "Tesla")
////    Color: Blue, Name: Tesla, Age: 12
////    Secondary constructor is called!
//    val car4 = Car("Silver", "Honda")
////    Color: Silver, Name: Honda, Age: 12
////    Secondary constructor is called!
//}
//
//class Car(val color: String, val name: String, val age: Int) { // 주생성자
//    init { // 객체가 생성되었을때 어떤 행동을 할지 초기화
//        println("Color: $color, Name: $name, Age: $age")
//    }
//
//    // 보조 생성자: 주 생성자의 역할을 보완하는 역할
//    constructor(color: String, name: String) : this(color, name, 12) {
//        println("Secondary constructor is called!")
//
//    }
//}
//
