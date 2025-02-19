package Basics

fun main(args: Array<String>){
    println("Variables : \n")
    // var can be reassigned
    // val can not be reassigned -> like final variable in JAVA -> constant

    var name = "Abhi"
    println("My Name is $name")

    // want to change my name
    name = "Abhishek"

    val surname = "Yadav"
    println("My Surname is $surname")

    // unable to change surname

    println("My Full Name is $name $surname")
}