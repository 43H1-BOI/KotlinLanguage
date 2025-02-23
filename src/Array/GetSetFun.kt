package Array

fun main(){
    val arr = arrayOf(1,3,5,7,8)

    // to set element at any index
    arr.set(2,2) // (index , new ele)
    // or
    arr[1] = 4

    // to get element at any index
    println(arr.get(2))
    // or
    println(arr[1])
}