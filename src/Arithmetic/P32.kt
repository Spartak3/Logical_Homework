package Arithmetic

//P32 (*) Determine the greatest common divisor of two positive integer numbers.

fun main(){
    println((36 to 36).gcd())
}


fun Pair<Int,Int>.gcd():Int{
    var one=first
    var two=second
    while (one!=two){
        if(one>two){
            one=one-two
        }
        else{
            two=two-one
        }
    }

    return one
}