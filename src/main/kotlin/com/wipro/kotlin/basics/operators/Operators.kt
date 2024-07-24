package com.wipro.kotlin.basics.operators

fun main(){
    var a = 10
    var b = 20
    var c = a + b
    println("Add = $c")
    c = a - b
    println("Subtract = $c")
    c = a * b
    println("Multiply = $c")
    c = a / b
    println("Divide = $c")
    c = a % b
    println("Moduls = $c")
    //argumented operator
    var counter = 0
    counter+=1
    println("Counter = $counter")
    //logical operators : based on boolean expressions
    var isValid = true
    var isEnabled = false
    var res = isValid && isEnabled
    println("res = $res")

    //Equals : Structural equals
    var x = 100
    var y = 100
    var isEqual = x == y
    println("X AND Y ARE Equal = $isEqual")

    var str = "hello"
    var str1 = str
    println("str and str1 are equal = ${str1==str}")

    //comparasional operator
    var isBig = a > b
    println("isBig = $isBig")
}