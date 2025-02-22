package Functions

fun main(){
    println(add(1,2,3))
    println(add(1.2,2.3))
    println(add(1,2))
}

fun add(num1: Int , num2: Int): Int{
    return num1+num2
}

fun add(num1: Int , num2: Int , num3: Int): Int{
    return num1+num2+num3
}

fun add(num1: Double , num2: Double): Double{
    return num1+num2
}