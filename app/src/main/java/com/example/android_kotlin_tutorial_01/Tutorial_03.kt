package com.example.android_kotlin_tutorial_01

//List 순서가 있는 데이터 집합으로 데이터의 중복을 허용합니다
//불변
fun ListTest() {
    var list = listOf<Int>(10,20,30)
    println("""
        list size: ${list.size}
        list data: ${list.get(0)}, ${list.get(1)}, ${list.get(2)}
    """.trimIndent())
}

//가변
fun MutableListTest() {
    var MutableList = mutableListOf<Int>(10,20,30)
    MutableList.add(3,40)
    MutableList.set(0,50)
    println("""
        MutableList size: ${MutableList.size}
        MutableList data: ${MutableList.get(0)}, ${MutableList.get(1)}, ${MutableList.get(2)}, ${MutableList.get(3)} 
    """.trimIndent())

}

//map 키와 값으로 이루어진 데이터 집합으르서 순서가 없으며 키의 중복은 허용하지 않습니다
//Dictionary?
fun MapTest() {
    var map = mapOf<String, String>(Pair("one", "hello"), "two" to "world")
    println("""
        map size: ${map.size}
        map data: ${map["one"]}, ${map.get("two")}
    """.trimIndent())
}



fun IfTest1() {
    var data = 10
    if (data > 0) {
        println("If Test true")
    } else {
        println("If Test false")
    }
}

fun IfTest2() {
    var data =  10
    if(data > 10) {
        println("data > 10")
    } else if(data > 0 && data <= 10) {
        println("data > 0 && data <= 10")
    } else {
        println("data <= 10")
    }
}

fun IfTest3() {
    var data = 10
    var result = if(data > 0) {
        println("data > 0")
        true
    } else {
        println("data <= 0")
        false
    }
    println(result)
}
