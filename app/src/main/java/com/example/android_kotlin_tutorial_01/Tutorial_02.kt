package com.example.android_kotlin_tutorial_01

import java.lang.Exception

fun VariableTest1() {
    val data1: Int = 10   //Swift let
    var data2 = 20
//val data3: Int   최상위에 선언한 변수나 클래스의 맴버 변수는 선언과 동시에 초기값을 할당해야 한다
    val data3: Int
    //data1 = 15
    data2 = 25
    println("data1: $data1")
    println("data2: $data2")
}

fun VariableTest2() {
    var data8: Int = 80
    var data9: Int? = null   // swift Optional

    data8 = data8 + 10
    println("data8 + 10: $data8")
    data8 = data8.plus(10)
    println("data8 + .plus: $data8")
}

fun VariableTest3() {
    //val data4: Int
    val data5: Int = 50   //최상위에 선언한 변수나 클래스의 맴버 변수는 선언과 동시에 초기값을 할당해야 한다
    lateinit var data6: String   //int, long, short, double, float, boolean,byte 에는 사용할 수 없다
    var data9: Any = 90
    var data10: Any = "Hello"
    var data11: Any = User()
}



val data7: Int by lazy{
    println("Test by lazy 2")
    70
    //   호출 시점에서 초기화
}   //   var는 사용 불가

class User



fun PrintTest() {
    var str1: String = "Hello \nWorld"
    var str2: String = """
        가나다
        마바사
        Test
    """.trimIndent()

    println("Hello world")
    println(str1)
    println(str2)
}



//Unit 다른 타입과 다르게 데이터 형식이 아닌 특수한 상황을 표현하려는 목적으로 사용
fun UnitTest(): Unit {
    val data1: Unit = Unit
    val data2: String
    fun some() {
        println("Unitsome: ${10+20}")
    }

    println("UnitTest : ${10 + 20}")
}
//함수를 선언할때 반환 타입을 생략하면 자동으로 Unit가 된다



//Nothing으로 선언한 변수에는 null만 대입할 수 있다 선언한 변수는 데이터로서의 의미는 없다
fun NothingTest() {
    val data1: Nothing? = null
    //val data2: Nothing = "Test"
}
fun some1(): Nothing? {
    return null
}
fun some2(): Nothing {
    throw Exception()
}



// 함수 선언
// 함수에는 반환타입을 선언 할 수 있으며 생략하면 자동으로 unit
fun Declaration1(data1: Int): Int {
    return data1* 10
}

fun Declaration2(data1: Int, data2: Int = 10): Int {
    return data1 * data2
}



fun ArrayTest1() {
    val data1: Array<Int> = Array(3, {0})
    data1[0] = 10
    data1[1] = 20
    data1.set(2,30)
    println("""
        array size: ${data1.size}
        array data: ${data1[0]}, ${data1[1]}, ${data1.get(2)}
    """.trimIndent())
}

fun ArrayTest2() {
    var data1 = arrayOf<Int>(10,20,30)   //크기가 3인 Int 배열을 선언하고 10,20,30을 할당
    println("""
        array size : ${data1.size}
        array data : ${data1[0]}, ${data1[1]}. ${data1.get(2)}
    """.trimIndent())
    var data2 = intArrayOf(10,20,30)
    var data3 = booleanArrayOf(true, false, true)
}
