package Basics
import java.util.Scanner

fun main(){
    var str1: String = readln()

    var num1: Int = readln().toInt()

    var num2: Int = readln().toInt()

    var num3: Int = readln().toInt()

    println(str1)
    println("Sum of $num1 , $num2 and $num3 is ${num1+num2+num3}")
}