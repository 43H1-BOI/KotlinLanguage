package Antiques

fun main() {
    println("Enter Your Choice :\n1. Rock\n2. Paper\n3. Scissors\nSelect Any One from Above :")
    val userInput = readln().toInt()
    val systemInput = (1..3).random()

    println("\n\n")
    input("You",userInput)
    input("System",systemInput)

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

fun input(inputBy: String, value: Int) {
    when (value) {
        1 -> println("$inputBy Selected Rock")
        2 -> println("$inputBy Selected Paper")
        else -> println("$inputBy Selected Scissors") // 3
    }
}