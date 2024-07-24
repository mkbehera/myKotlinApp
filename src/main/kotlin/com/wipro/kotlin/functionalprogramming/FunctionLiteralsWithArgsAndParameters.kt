package com.wipro.kotlin.functionalprogramming

/*var add:(Int, Int) -> Int = fun(a: Int, b: Int):Int {
    return a + b
}*/
/*var add = fun(a: Int, b: Int): Int {
    return a + b
}*/
var add = fun(a: Int, b: Int) = a + b
fun main() {
    println(add(10, 20))
}