package com.wipro.kotlin.functions.normal.args.varargs

fun logger(vararg args: String){
    for (arg in args) println(arg)
}

fun main() {
    logger("Employee.kt", "Warning", "Save method is called")
    logger("Employee.kt", "Error", "Remove method is called", "501")
}