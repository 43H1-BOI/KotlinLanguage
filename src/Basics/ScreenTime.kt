package Basics

import java.util.Scanner

fun main() {
    val Sc = Scanner(System.`in`)

    println("Enter Today's Screen Time : ")
    var todayST: Int = Sc.nextInt()

    println("Enter Yesterday's Screen Time : ")
    var yesterdayST: Int = Sc.nextInt()

    if (todayST >= yesterdayST) {
        println("Now , You are getting out of Control.")
    } else println("You are in Control")

}