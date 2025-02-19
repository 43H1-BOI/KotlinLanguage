package Basics

fun main(args: Array<String>) {

    // Increment Decrement Operators
    // a++ , a-- -> Post -> First gives Value then Perform Operation
    // ++a , --a -> Pre -> First Perform Operation then gives Value


    val a = 9 // Assignment Operator
    var b = 4
    b += 3 //  This is Also Assignment Operator
    println("Value of A = $a And Value of B = $b")

    // Arithmetic Operator
    println("Sum of a and b is " + (a + b))
    // + , - , / , *

    if (a == b) { // Comparison Operator
        println("Equal")
    } else println("Not Equal")
    // == , != , >= , <= , > , <

    val c = true
    println(a > b && a == b) // Logical Operator
    println("Not of True is " + (!c))
    // && , || , !

    // Bitwise Operator operates with bits ( &,| )

    // Left Shift << and Right Shift >> Operator
    // It Also Performs Operations on Bits
    println("Using Left Shift Operator << ")
    println(9 shl 2)
    // shl -> << -> Left Shift

    // This means we want to shift binary form of 9 by 2 position in left
    // 9 --> 1001 :: the answer will be 100100 --> 36
    // Formula :: a << b = a * 2^b
    println("Using Right Shift Operator >> ")
    println(10 shr 2)
    // shr -> >> -> Right Shift

    // This means we want to shift binary form of 9 by 2 position in right
    // 10 --> 1010 :: the answer will be 0010 --> 2
    // Formula :: a >> b = a / 2^b
}
