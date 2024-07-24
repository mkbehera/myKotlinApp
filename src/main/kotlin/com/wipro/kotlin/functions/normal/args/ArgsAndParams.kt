package com.wipro.kotlin.functions.normal.args

import javax.annotation.processing.Messager

fun sayHello(message: String) {
    println(message)
}
fun add(a: Int, b: Int) {
    var c = a + b
    println("c = $c")
}
fun main() {
    sayHello("Hello Manoj")
    add(1, 2)
}