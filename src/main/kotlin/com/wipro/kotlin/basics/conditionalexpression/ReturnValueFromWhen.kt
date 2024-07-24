package com.wipro.kotlin.basics.conditionalexpression

fun main(){
    var isLoggedIn = false
    var status = when(isLoggedIn){
        true -> "Logged Out"
        false -> "Not logged in"
    }
    println(status)
}