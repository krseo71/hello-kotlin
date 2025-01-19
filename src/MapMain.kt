fun main() {
    /**
     * [Collection]
     * 2. Map: 키(Key)-값(value) 쌍으로 이루어짐
     */
    val immutableMap = mapOf("name" to "tom", "age" to 20, "height" to 180)
    println(immutableMap) // {name=tom, age=20, height=180}
    println(immutableMap["name"]) // tom
    println(immutableMap["no"]) // null
//    immutableMap["age"] = 30 // 불변이기때문에 변경 불가능: No set method providing array access

    println()
    println()

    val mutableMap = mutableMapOf("name" to "tom", "age" to 20, "height" to 180)
    println(mutableMap) // {name=tom, age=20, height=180}
    println(mutableMap["age"]) // 20
    mutableMap["age"] = 30 // 변경 가능
    println(mutableMap["age"]) // 30

    // 추가
    mutableMap.put("hobby", "coding")
    println(mutableMap) // {name=tom, age=30, height=180, hobby=coding}
    // 삭제
    mutableMap.remove("name")
    println(mutableMap) // {age=30, height=180, hobby=coding}

    mutableMap.replace("age", 40) // mutableMap["age"] = 40 처럼 값을 할당 해도 되고 함수도 사용 가능
    println(mutableMap) // {age=40, height=180, hobby=coding}
}