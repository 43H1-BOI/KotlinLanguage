package Antiques

import kotlin.random.Random

fun main() {


    println("Enter Your Choice :\n1. Rock\n2. Paper\n3. Scissors\nSelect Any One from Above :")
    val userInput = readln().toInt()
    val systemInput = (1..3).random()

    println("\n\n")
    when (userInput) {
        1 -> println("You Selected Rock")
        2 -> println("You Selected Paper")
        else -> println("You Selected Scissors") // 3
    }
    when (systemInput) {
        1 -> println("System Selected Rock")
        2 -> println("System Selected Paper")
        else -> println("System Selected Scissors") // 3
    }


    if (userInput == 1 && systemInput == 3) {
        println("Hurray ! You Won")
    } else if (userInput == 2 && systemInput == 1) {
        println("Hurray ! You Won")
    } else if (userInput == 3 && systemInput == 2) {
        println("Hurray ! You Won")
    } else if (userInput == systemInput) {
        println("Match Draw")
    } else {
        println("System Won !")
    }
}