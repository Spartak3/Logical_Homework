package Arithmetic

/*
P40 (*) Goldbach's conjecture.

Goldbach's conjecture says that every positive even number greater than 2 is the sum of two
prime numbers. E.g. 28 = 5 + 23. It is one of the most famous facts in number theory that has not been
proved to be correct in the general case. It has been numerically confirmed up to very
large numbers (much larger than Kotlin's Int can represent). Write a function to find the two
prime numbers that sum up to a given even integer.
 */

fun main(){

    println(992.goldbach(0))
    //println(51.isPrime())
}

fun Int.goldbach(limit:Int):Pair<Int,Int>{
    if(this<limit){
        return 0 to 0
    }
    var primeNumber:Int
    if(limit==0)
        primeNumber=2
    else
        primeNumber=53
    while (true){
        if((this-primeNumber).isPrime()){
            return primeNumber to this-primeNumber
        }
        else{
            primeNumber= nextPrime(primeNumber)
        }
    }
}