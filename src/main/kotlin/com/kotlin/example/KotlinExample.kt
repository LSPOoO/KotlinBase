package com.kotlin.example

const val PI = 3.141592657

fun main(){

    kotlinAnonymousFunctionExample()

}

//Kotlin语言的匿名函数
//匿名函数的隐式返回，返回值放在最后一行，不需要return关键字
private fun kotlinAnonymousFunctionExample(){
    val name = "linshipeng"
    val age = 32
    var length = name.count();
    println(length)
    length = name.count { it == 'i' }
    println(length)


    //匿名函数的具体使用实例
    val anonymousExample1 : (String , Int) -> String = { studentName, studentAge ->
        "${studentName}的年龄是：${studentAge}岁"
    }
    println(anonymousExample1("linshiepng", 32))

    val anonymousExample2 : (String , Int) -> Unit = { studentName : String, studentAge : Int ->
        println("${studentName}的年龄是：${studentAge}岁")
    }
    anonymousExample2.invoke("linshiepng", 32)

    //it关键字，只有一个参数时，it可指代
    val anonymousExample3 : (String) -> Unit = {
        println("该同学的姓名是：${it}")
    }
    anonymousExample3("linshiepng")

    //匿名函数的类型推断
    val anonymousExample4 = {studentName : String, studentAge : Int ->
        println("${studentName}的年龄是：${studentAge}岁")
    }
    anonymousExample4("linshiepng", 32)
}

//Kotlin语言中反引号内的函数名
private fun `kotlin special function example`(){
}

//Kotlin语言的Nothing类以及TODO函数，用于终止程序现挡雨Java中的抛异常
//TODO函数的返回值是Nothing类
private fun kotlinNothingExample(number : Int){
    when (number) {
        -1 -> TODO("It's wrong number...")
        else -> {
            println("number is: ${number}")
        }
    }
}

//Kotlin语言的Unit类型，相当于Java语言中的void关键字
private fun kotlinUnitExample() : Unit{

}

//Kotlin的函数头规范
//Kotlin函数的参数的默认值
//Kotlin函数的具名函数参数
private fun kotlinFunctionExample(name : String = "linshipeng", age : Int = 42) : Int{
    println("${name}的年龄是：${age}")
    return age;
}

//Kotlin语言的String模版
fun kotlinStringExample(){
    var name = "linshipeng"
    var age = 41
//    println("${name}的年龄是：${age}")
    println("${name}的年龄是：${age},他${if (age in 0..40) "是" else "不是"}一个年轻人")
}

//when表达式
//如下，result最终是Any类型，相当于Java中的Object类型
fun kotlinWhenExample(day : Int){
    val result = when(day){
        1 -> "今天是星期一"
        2 -> "今天是星期二"
        3 -> "今天是星期三"
        4 -> "今天是星期四"
        5 -> "今天是星期五"
        6 -> "今天是星期六"
        7 -> "今天是星期日"
        else -> {
            println("未知")
        }
    }
    println(result)
}

//Range表达式
fun kotlinRangeExample(){
    //range表达式
    var number = 3
    if (number in 0..4){
        println("small")
    } else if (number in 5..8){
        println("middle")
    } else {
        println("large")
    }
}



