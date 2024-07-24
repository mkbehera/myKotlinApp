package com.wipro.kotlin.basics.types

fun main(){
    // traditional style: java style
    var doc = "<html>"+
            "<head>" +
            "<title>Home</title>" +
            "</head>" +
            "<body>"+
            "</body>"+
            "</html>"
    println(doc)
    //kotlin style
    var message = "Hello"
    var newDoc="""
        <html>
        <head>
        <title>Home</title>
        </head>
        <body>
        <h1>${message}</h1>
        </body>
        </html>
    """.trimIndent()
    println(newDoc)
}