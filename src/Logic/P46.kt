package Logic

import javax.management.Query.and

/**
 *
 * P46 (*) Truth tables for logical expressions.

Define functions and_, or_, nand_, nor_, xor_, impl_, and equ_ (for logical equivalence)
which return true or false according to the result of their respective operations.
 */

fun main(){
    println(true.xor_(false))
    println("------------------")
    printTruthTable(){a,b -> a.impl_(b)}
}



fun Boolean.and_(other:Boolean):Boolean{
    return if(this) other else false
}

fun Boolean.or_(other:Boolean):Boolean{
    return if(this) this else other
}

fun Boolean.nand_(other:Boolean):Boolean{
    return this!=other
}

fun Boolean.nor_(other:Boolean):Boolean{
    return if(!this) this==other else false
}

fun Boolean.xor_(other:Boolean):Boolean{
    return this!=other
}

fun Boolean.impl_(other: Boolean):Boolean{
    return if(this) other else true
}


fun Boolean.equ_(other: Boolean):Boolean{
    return this==other
}

fun printTruthTable(foo:(Boolean,Boolean)->Boolean){
        println("a     b     result")
        println("true  true  ${foo(true,true)}")
        println("true  false  ${foo(true,false)}")
        println("false  true  ${foo(false,true)}")
        println("false  false  ${foo(false,false)}")
}



