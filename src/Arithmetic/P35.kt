package Arithmetic

//P35 (*) Determine prime factors of a given positive integer.

fun main(){
    //println(nextPrime(5))
    println(32.primeFactors())
}

fun Int.primeFactors(): ArrayList<Int> {
    var res=1
    var i=2
    var num=this
    val list= ArrayList<Int>()
    while (res!=this){
        if(num%i==0) {
            list += i
            res*=i
            num/=i
        }
        else i= nextPrime(i)
    }
    return list
}

fun nextPrime(i:Int):Int{
    var a=i+1
    while (!a.isPrime()){
        a++
    }
    return a

}


