package Arithmetic

//P37 (*) Calculate Euler's totient function phi(m) (improved).

fun main(){
    println(calculateEulerFoo(315.primeFactorMultiplicity()))
}


fun calculateEulerFoo(list:List<Pair<Int,Int>>):Int{
    var value:Int=1
    for (pair in list){
        value=(pair.first-1)*Math.pow(pair.first.toDouble(),pair.second.toDouble()).toInt()
    }

    return value
}