package com.example.android_kotlin_tutorial_01

import java.lang.Exception

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