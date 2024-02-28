package Fundamentos

fun main(){
    var firstValue = 5
    var secondValue = 2

    firstValue++
    secondValue+=3


    sum(firstValue, secondValue)
    remove(firstValue, secondValue)
    mult(firstValue, secondValue)
}

fun mult(a: Int, b:Int){
    println("a multiplicacao de $a * $b = ${a * b}")
}

fun sum(a: Int, b: Int){
    println("a soma de $a + $b = ${a + b}")
}

fun remove(a: Int, b: Int){
    println("a subtracao de $a - $b = ${a + b}")
}

