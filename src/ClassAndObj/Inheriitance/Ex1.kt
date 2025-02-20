package ClassAndObj.Inheriitance

fun main(){
    val G1 = Gamer("Abhi","Yadav",19)
    G1.details()
}

open class Person(var fName: String, var lName: String, var age: Int) {
    open lateinit var profession : String
    // member functions
    fun walk() {
        println("$fName can walk")
    }

    fun talk() {
        println("$fName can talk")
    }

    fun eat() {
        println("$fName can eat")
    }

    open fun details() {
        println("Person Details : \n")
        println("Name : $fName $lName")
        println("Age : $age")
    }

    open fun canDo(){}
}

class Gamer(fName: String, lName: String, age: Int) : Person(fName, lName, age){
     override var profession = "Gamer"

    // member functions
    override fun canDo(){
        println("$fName can play Games")
    }

    override fun details(){
        super.details()
        println("Profession : $profession")
    }
}