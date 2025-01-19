/**
 * 리스트
 */
fun main() {
    /**
     * [Collection]
     * 1. List
     */

    val fruitList = listOf("Banana", "Apple", "Melon") // immutableList, immutable은 생략되어있다고 보면 됨
    println("First fruit: ${fruitList[0]}") // First fruit: Banana
//    fruitList[0] = "Strawberry" // immutable 이기때문에 변경 불가능

    val mutableFruitList = mutableListOf("Banana", "Apple", "Melon") // mutableList
    println("First fruit: ${mutableFruitList[0]}") // First fruit: Banana
    mutableFruitList[0] = "Strawberry" // mutableList 값 변경 가능
    println("First fruit: ${mutableFruitList[0]}") // First fruit: Strawberry

    //iterable 인터페이스를 구현하고 있어 하나씩 순회할 수 있다.
    mutableFruitList.forEach { fruit ->
        println("My Fruit List: $fruit")
//        My Fruit List: Strawberry
//        My Fruit List: Apple
//        My Fruit List: Melon
    }

}