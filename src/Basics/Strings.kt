package Basics

import java.util.*

fun main(){
    val name = "Abhishek"
    for(i in name) println(i)

    println()

    val longStr:String = "This is A LONG string"
    println(longStr) // normal one

    println(longStr.lowercase()) // lower case

    println(longStr.uppercase()) // UPPER CASE
}