package com.wipro.kotlin.functionalprogramming.hof

import com.wipro.kotlin.functionalprogramming.sayHello

/*fun add(a: Int, b: Int): Int{
    return a + b
}
fun main() {
    //How to pass values to the function
    //hard coded value
    println(add(10, 10))
    //via variables
    var x = 10
    var y = 20
    println(add(x, y))
}*/

//Basic higher order function
fun sayGreet(action:()->Unit){
    //println(action.invoke())
    action.invoke()
    action()
}

//


fun main() {
    //passing functions pattern
    var hello = fun(){
        println("Hello")
    }
    //passing function via variable
    sayGreet(hello)
    //passing function as literal to the function
    sayGreet(fun() {
      println("Hello")
    })

}