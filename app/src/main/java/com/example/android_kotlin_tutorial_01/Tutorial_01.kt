package com.example.android_kotlin_tutorial_01

fun main() {
    PrintTest()

    VariableTest1()
    VariableTest2()
    VariableTest3()
    println("Test1: ${VariableTest1()}, Test3 ${VariableTest2()}, plus: ${10 + 20}")

    println("Test by lazy 1")
    println("data7: $data7")   //lazy

    UnitTest()

    println("Declaration1 : ${Declaration1(10)}")
    println("Declaration2 : ${Declaration2(10,20)}")
    Declaration2(data2 = 20, data1 = 10)   //지정해서 호출나는 경우 순서가 달라도 무관

    ArrayTest1()
    ArrayTest2()

    ListTest()
    MutableListTest()
    MapTest()

    IfTest1()
    IfTest2()
    IfTest3()
}









