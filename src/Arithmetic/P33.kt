package Arithmetic

//P33 (*) Determine whether two positive integer numbers are coprime.

fun main(){
    println(35.isCompare(64))
}


fun Int.isCompare(a:Int):Boolean{
    return (this to a).gcd()==1
}