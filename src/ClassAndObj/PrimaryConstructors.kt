package ClassAndObj

fun main() {
    val P1 = People("Abhi",19)

    println("Person Constructor Called Above")
}

class People(val name: String, var age: Int){
    val FName : String
    var MainAge : Int

    // Used to initialise constructors
    init{
        FName = this.name
        MainAge = this.age
        println("Init Block Called i.e. Primary Constructor")
    }
}