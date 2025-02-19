package ClassAndObj

fun main(){
    val C1 = Car("Volvo",123456789)
    val C2 = Car("Hindustan Motors",542486543,"Abhi")
}

class Car{
    var company:String
    var regNo:Long
    var owner:String = ""

    constructor(c:String, reg:Long){
        this.company = c
        this.regNo = reg
        println("1st Constructor Called")
    }
    constructor(c:String, reg:Long, own:String){
        this.company = c
        this.regNo = reg
        this.owner = own
        println("2nd Constructor Called")
    }
}