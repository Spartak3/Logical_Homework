package Arithmetic

//P34 (*) Calculate Euler's totient function phi(m).

fun main(){
    println(10.toTient())
}


fun Int.toTient():Int{
    var count=0
    for (i in 1..this){
        if((i to this).gcd()==1) count++
    }
    return count
}