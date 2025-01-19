fun main() {
    /**
     * [Collection]
     * 2. Set: 순서 없음, 중복 안됨
     */

    // Immutable Set
    val immutableNumSet = setOf(1,2,2,3,3,3,4,4,4,4)
    println(immutableNumSet) // [1, 2, 3, 4]

    // Mutable Set
    val mutableNumSet = mutableSetOf<Int>(1, 2, 2, 3, 3, 3, 4, 4, 4, 4)
    println(mutableNumSet) // [1, 2, 3, 4]
    // 가변되기 때문에 추가 삭제가 가능
    mutableNumSet.add(100)
    println(mutableNumSet) // [1, 2, 3, 4, 100]
    mutableNumSet.remove(1)
    println(mutableNumSet) // [2, 3, 4, 100]
    println(mutableNumSet.contains(1)) // false

}