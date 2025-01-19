fun main(args: Array<String>){
    val a = A()
    println("a.a: ${a.a}") // a.a: 1
    println("a.b: ${a.b}") // a.b: 2

    val b = B()
//    println("b.c: ${b.c}") // private 접근 불가능
    println("b.d: ${b.d}") // b.d: 4

    val c = C()
//    println(c.e) // protected 상속받은 클래스에서만 접근 가능
//    println(c.f) // private 접근 불가능
    println(c.g) // 7

    val d = D()
    d.callPrintC()
//    e: 5
//    g: 7
}

public class A {
    public val a = 1;
    val b = 2;
}

class B {
    private val c = 3;
    public val d = 4;
}

open class C {
    protected val e = 5;
    private val f = 6;
    public val g = 7;
}
class D: C(){
    private fun printCProperties() {
        println("e: $e") // C를 상속받았기에 protected 접근 가능
//        println("f: $f") // private 접근 불가능
        println("g: $g")
    }

    fun callPrintC() {
        printCProperties() // private: 내부에서만 호출 가능
    }
}