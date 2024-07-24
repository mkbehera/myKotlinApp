package com.wipro.kotlin.functions.normal.args.defaultargs

fun format(str: String = "str", normalizeCase:Boolean=false, upperCaseFirstLetter:Char='A') {
    println("Str $str normalizeCase ${normalizeCase} upperCaseFirstLetter ${upperCaseFirstLetter}")
}
fun main() {
    format();
    //named parameters
    format(str = "Hello", upperCaseFirstLetter = 'B', normalizeCase = true)
    format(normalizeCase = false)
}