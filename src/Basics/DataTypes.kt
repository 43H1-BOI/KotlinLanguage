package Basics

fun main(){
    println("Data Types : \n")

    var name: String = "Abhishek"
    var age: Int = 96
    var isAdult: Boolean = true

    var surname = "Yadav"
    var exp = 39
    var isBadMan = false

    // Both Types of Assignment are Allowed in Kotlin
    // var is smart enough to get the data type automatically

    println("Name : $name $surname")
    println("Age : $age")
    println("Experience : $exp")
    println("is Adult ? : $isAdult")
    println("is Bad Man ? : $isBadMan")

}