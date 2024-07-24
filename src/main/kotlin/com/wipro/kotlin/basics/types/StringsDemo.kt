package com.wipro.kotlin.basics.types

fun main(){
    var firstName:String = "Manoj"
    var lastName = "Behera"
    //java style: it is not recommended
    println("Name  " +firstName + " " +lastName)
    //kotlin style: using String interpolation
    println("Name $firstName $lastName" )
}