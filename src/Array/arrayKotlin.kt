package Array

fun main() {
    // declaration of Array
    var arr = arrayOf("Abhi", "Sheikh", "Yadav")

    for (ele in arr) println(ele)

    var i = 0;
    for (i in 0..<arr.size) {
        println(arr[i])
    }

    // General One
    var genArr = arrayOf(1, 2.3, "Abhi", 'S')

    // for each specific type
    var intArr = arrayOf<Int>(1, 3, 5, 7)

    var stringArr = arrayOf<String>("Heeelo", "Mukesh", "Ji")

    var boolArr = arrayOf<Boolean>(true, true, false, true)
    // ... and so on


    // array of size filled with null elements of Int Type
    var nullArr = arrayOfNulls<Int>(4)
}