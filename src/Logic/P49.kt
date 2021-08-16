package Logic


/*
P49 (*) Gray code.
An n-bit Gray code is a sequence of n-bit strings constructed according to certain rules.
Find out the construction rules and write a function to generate Gray codes. For example:
 */

fun main(){
    println(generateGrayarr(3))
}

fun generateGrayarr(n: Int):ArrayList<String> {

    val arr = ArrayList<String>()
    arr.add("0")
    arr.add("1")
    var i: Int
    var j: Int
    i = 2
    while (i < 1 shl n) {
        j = i - 1
        while (j >= 0) {
            arr.add(arr[j])
            j--
        }
        j = 0
        while (j < i) {
            arr[j] = "0" + arr[j]
            j++
        }
        j = i
        while (j < 2 * i) {
            arr[j] = "1" + arr[j]
            j++
        }
        i = i shl 1
    }
    return arr
}







