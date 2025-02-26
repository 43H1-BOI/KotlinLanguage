package Antiques

fun main() {
    var userInput = 1
    do {
        println("\n1. Rock \n2. Paper \n3. Scissors \n0. Exit Game \nSelect Any One from Above :\n")
        print("Enter Your Choice : ")
        userInput = readln().toInt()
        if (userInput == 0) {
            continue
        }
        val systemInput = (1..3).random()

        println()
        input("You", userInput)
        input("System", systemInput)

        val winner: String = when {
            userInput == systemInput -> "Tie"
            (userInput == 1 && systemInput == 3) || (userInput == 2 && systemInput == 1) || (userInput == 3 && systemInput == 2) -> "You"
            else -> "System"
        }

        /*
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
    */

        if (winner == "Tie") {
            println("Match Draw")
        } else {
            println("$winner Won")
        }

        println("\nWanna Play Again ?\nEnter 4 to Play Again\nEnter 0 to Exit")
        userInput = readln().toInt()

    } while (userInput != 0)
    println("Thanks for Playing")
}

fun input(inputBy: String, value: Int) {
    when (value) {
        1 -> println("$inputBy Selected Rock")
        2 -> println("$inputBy Selected Paper")
        else -> println("$inputBy Selected Scissors") // 3
    }
}