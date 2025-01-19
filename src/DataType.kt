/**
 * 2. 자료형
 */

fun main(args: Array<String>){

//    1. Numbers
//     정수형
//    1-1. Byte : -128~127
    var mByte:Byte = 100
//    1-2. Short : -32,768(-2^15) ~ 32,767(2^15 -1)
    var mShort:Short = 1000
//    1-3. Int: -2,147,483,648(-2^31) ~ 2,147,483,647(2^31 -1)
    var mInt:Int = 100000
    var mInt2 = 100000 // Int로 자료형 추론
//    1-4. Long: (-2^63~2^63-1)
    var mLong:Long = 10000000000L

//    실수형
//    1-5. Float
    var mFloat:Float = 1.5f
//    1-6. Double
    var mDouble:Double = 1.423423

//    2. Characters
    var mChar: Char = 'c' // 글자 하나만 할당 ''작은따옴표 사용

//    3. Strings
    var mString: String = "Hello Kotlin" // "" 큰 따옴표 사용

//    4. Booleans 논리 자료형
    var mFalse:Boolean = false
    var mTrue:Boolean = true


//    5. Arrays 배열
    var mArray: Array<String> = arrayOf("one","two","three","four","five","six")
    println(mArray[0]) // one
    println(mArray.get(0)) // one
    println(mArray.size) // 6

}