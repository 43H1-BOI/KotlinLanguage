# Some Important Points

### About Classes and Objects

#### Parameter and data member in class
- In 1st Code , val means it's part of class
and
- In 2nd Code , val is not present means it is just getting passed as parameter

```kotlin 
// 1st Code
class dog(val name: String){
    init {
        println("$name Woof Woof")
    }
    // data members
    // member functions
}

// 2nd Code
class cat(name: String){
    init {
        println("$name Meow Meow")
    }
    // data members
    // member functions
}

fun main(){
    // In Dog, name is a property so we can call the below : ${r.name}
    val r = dog("Robot")
    println("val name: String -> ${r.name}")

    // In Cat, name is not property so we can't call the below : ${s.name}
    val s = cat("Stacy")
    println("val name: String -> ${s.name}")
}
```

#### Data Class
- Data Class is a class which is only used to store data
- This is not used to perform other actions
- Creating Data Class means Creating `Own Data Type`