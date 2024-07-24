package com.wipro.kotlin.basics.ifoperations

fun main(){
    var a =100
    var b = 2055
    var max = a
    //traditional style: java style
    if(a < b){
        max = b
    }
    println("max $max")

    //kotlin expression style
    if(a < b) max = b // here we return max variable
    println("max $max")

    //if..else : java style
    if (a > b) {
        max = a
    }
    else{
        max = b
    }
    println("max $max")

    //if..else : kotlin style
    max = if (a > b) a else b
    println("max $max")

    var isValid = true
    var res = if(isValid) "Greet" else "GoodBye"
    println(res)

    //block of code with if and else
    res = if(isValid) {
        println("More Code")
        var firstName = "Manoj"
        //return value
        "Hello $firstName"
    }else{
        println("More Code")
        var firstName = "Behera"
        //return value
        "How are you? Mr/Mrs $firstName"
    }
    println(res)

}