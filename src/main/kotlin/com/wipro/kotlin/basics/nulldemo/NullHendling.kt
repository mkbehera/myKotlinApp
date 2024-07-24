package com.wipro.kotlin.basics.nulldemo

fun main() {
    var name: String? = null
    //Ways to handle null
    //Way 1: Handling null using java style
    //name.length - causes compile time error
    if(name!=null) {
        println(name.length)
    }
    //Way 2: Kotlin style "Using safe navigation operator"
    println(name?.length)

    //Way 3: Kotlin style "Elvis Operator" : if there is null, if you want some default
    //value instead of "null" string.
    var length = name?.length ?: 0
    println("String length is $length")

    //Way 4: Kotlin Style for some reason, "If you want runtime exception"
    // How to throw NullPointerException
    //!! assertion operator throws runtime Exception
    println("${name!!.length}")
}