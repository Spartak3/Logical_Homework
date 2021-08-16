package Arithmetic

/*P39 (*) A list of prime numbers.

Given a range of integers by its lower and upper limit, construct a list of all prime numbers in that range.
 */


fun main(){

    println(listPrimesInRange(7..31))
}


fun listPrimesInRange(numbers:IntRange):List<Int>{
    var list=ArrayList<Int>()
    for (i in numbers){
        if(i.isPrime())
            list+=i
    }
    return list

}


