package com.wipro.kotlin.functions.normal.returntypes

//fun sum(a: Int=0, b: Int=0):Int{
//    return a * b
//}

//fun sum(a: Int=0, b: Int=0): Int = a * b

//return type also can be omitted
fun sum(a: Int=0, b: Int=0) = a * b
fun accept(name:String="name") = "Hello $name"

fun main() {
    println(sum(1, 2))
    println(sum(b = 90, a = 10))
    println(accept("Manoj Kumar Behera"))
}