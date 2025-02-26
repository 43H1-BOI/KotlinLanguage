package Antiques

fun main(){
    print("Enter Your Name : ")
    var name = readln()
    print("Enter Count of Sugar Cubes : ")
    var sugarCount = readln().toInt()

    makeCoffee(name, sugarCount)
}

fun makeCoffee(name: String , sugarCount :Int){
    println("Making Coffee for $name")
    if(sugarCount in 0.. 1){
        println("with $sugarCount sugar cube in it")
    } else {
        println("with $sugarCount sugar cubes in it")
    }
}