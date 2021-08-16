package Arithmetic

/*
P41 (*) A list of Goldbach compositions.

Given a range of integers by its lower and upper limit,
print a list of all even numbers and their Goldbach composition.
 */


fun main(){

    printGoldbachList(10..20)
    printGoldbachListLimited(900..1400,50)
}

fun printGoldbachList(range:IntRange):Unit{
    var pair:Pair<Int,Int> = 0 to 0
    for(i in range step 2){
        pair=i.goldbach(0)
        println("$i = ${pair.first} + ${pair.second}")
    }

}

fun printGoldbachListLimited(range: IntRange,limit:Int){
    var pair:Pair<Int,Int> = 0 to 0
    for(i in range step 2){
        pair=i.goldbach(limit)
        println("$i = ${pair.first} + ${pair.second}")
    }
}