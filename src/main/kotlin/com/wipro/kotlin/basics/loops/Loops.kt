package com.wipro.kotlin.basics.loops

fun main(){
    //RANGE
    for (count in 1..10) {
        println("RANGE count $count")
    }

    //REVERSE ORDER
    for (count in 5 downTo 1) {
        println("REVERSE ORDER count $count")
    }

    //step by
    for (count in 1 .. 10 step 2) {
        println("step by count $count")
    }

    //UNTIL
    for (count in 5 until  10) {
        println("Until count $count")
    }
}