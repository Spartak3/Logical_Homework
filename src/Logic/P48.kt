package Logic



fun main(){

    println(true.or_(true,false,false))
}

fun Boolean.and_(vararg other:Boolean):Boolean{
    var bool=other[0]
    for(i in 1 until other.size-1){
        bool=bool.and_(other[i])
    }
    return bool
}

fun Boolean.or_(vararg other:Boolean):Boolean{
    var bool=other[0]
    for(i in 1 until other.size-1){
        bool=bool.or_(other[i])
    }
    return bool
}

fun Boolean.nand_(vararg other:Boolean):Boolean{
    var bool=other[0]
    for(i in 1 until other.size-1){
        bool=bool.nand_(other[i])
    }
    return bool
}

fun Boolean.nor_(vararg other:Boolean):Boolean{
    var bool=other[0]
    for(i in 1 until other.size-1){
        bool=bool.nor_(other[i])
    }
    return bool
}

fun Boolean.xor_(vararg other:Boolean):Boolean{
    var bool=other[0]
    for(i in 1 until other.size-1){
        bool=bool.xor_(other[i])
    }
    return bool
}

fun Boolean.impl_(vararg other: Boolean):Boolean{
    var bool=other[0]
    for(i in 1 until other.size-1){
        bool=bool.impl_(other[i])
    }
    return bool
}

fun Boolean.equ_(vararg other: Boolean):Boolean{
    var bool=other[0]
    for(i in 1 until other.size-1){
        bool=bool.equ_(other[i])
    }
    return bool
}