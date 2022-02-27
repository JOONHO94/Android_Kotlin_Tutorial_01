package com.example.android_kotlin_tutorial_01

fun main() {
    println("Hello world")
    var str1: String = "Hello \nWorld"
    var str2: String = """
        가나다
        마바사
        Test
    """.trimIndent() 

    println(str1)
    println(str2)
    Test1()
    println("Test by lazy 1")
    Test3()
    println("data7: $data7")

    println("Test1: ${Test1()}, Test3 ${Test3()}, plus: ${10 + 20}")
}


val data1: Int = 10   //Swift let
var data2 = 20
//val data3: Int   최상위에 선언한 변수나 클래스의 맴버 변수는 선언과 동시에 초기값을 할당해야 한다


fun Test1() {
    val data3: Int
    //data1 = 15
    data2 = 25
    println("data1: $data1")
    println("data2: $data2")
}


class Test2 {
    //val data4: Int
    val data5: Int = 50   //최상위에 선언한 변수나 클래스의 맴버 변수는 선언과 동시에 초기값을 할당해야 한다
    lateinit var data6: String   //int, long, short, double, float, boolean,byte 에는 사용할 수 없다
}


val data7: Int by lazy{
    println("Test by lazy 2")
    70
    //   호출 시점에서 초기화
}   //   var는 사용 불가


fun Test3() {
    var data8: Int = 80
    var data9: Int? = null   // swift Optional

    data8 = data8 + 10
    println("data8 + 10: $data8")
    data8 = data8.plus(10)
    println("data8 + .plus: $data8")
}

var data9: Any = 90
var data10: Any = "Hello"

class User
var data11: Any = User()


