package Arithmetic


//P31 (*) Determine whether a given integer number is prime.

fun main(){
    println(8.isPrime())
}

fun Int.isPrime():Boolean{
    if(this==1) return false
    for(i in 2..(Math.sqrt((this).toDouble())).toInt()){
        if(this%i==0) return false
    }
    return true
}

