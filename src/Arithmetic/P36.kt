package Arithmetic

//P36 (*) Determine the prime factors of a given positive integer (2).

fun main(){
    println(315.primeFactorMultiplicity())
}


fun Int.primeFactorMultiplicity():List<Pair<Int,Int>>{
    val map= mutableMapOf<Int,Int>()
    var count=1
    for (i in this.primeFactors()){
        if(!map.containsKey(i)){
            map.put(i,1)
        }
        else
            map.put(i,map.getValue(i)+1)
    }
    return map.toList()
}
