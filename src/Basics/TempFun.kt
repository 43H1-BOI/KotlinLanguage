package Basics

fun main() {
//    println(TempDetails("Ankara",27,31,82))
//    println(TempDetails("Tokyo",32,36,10))
//    println(TempDetails("Cape Town",59,64,2))
//    println(TempDetails(HT = 50,LT = 55, ChanceOfRain = 7))

    TempDetails2("Ankara",27,31,82)
    TempDetails2("Tokyo",32,36,10)
    TempDetails2("Cape Town",59,64,2)
    TempDetails2(HT = 50,LT = 55, ChanceOfRain = 7)
}


fun TempDetails(City:String = "Unknown",LT:Int , HT:Int , ChanceOfRain:Int) : String{
    return "City: $City \nLow temperature: $LT, High temperature: $HT \nChance of rain: $ChanceOfRain%\n\n"
}

fun TempDetails2(City:String = "Unknown",LT:Int , HT:Int , ChanceOfRain:Int){
    println("City: $City")
    println("Low temperature: $LT, High temperature: $HT")
    println("Chance of rain: $ChanceOfRain%\n")
}