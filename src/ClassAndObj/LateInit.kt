package ClassAndObj

fun main() {
    val L1 = Laptop("Asus",3122)

    L1.iniPrice(50000,"Lappy")
    L1.displayDetails()

}

class Laptop(val companyName: String,val modelNumber: Int) {
    // lateinit cannot be used with Primitive datatypes like Int , Double , etc.
    var price: Int = 0

    // but can be used with Non-Primitive one
    lateinit var name: String

    fun iniPrice(LaptopPrice:Int, LaptopName:String){
        price = LaptopPrice
        name = LaptopName
    }

    fun displayDetails(){
        println("Laptop Details : \n")
        println("Laptop Name : $name")
        println("Company : $companyName")
        println("Model : $modelNumber")
        println("Price : $price")
    }

}