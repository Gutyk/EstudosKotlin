package fundamentos.controle

fun main(){
    val num1: Int = 7
    val num2: Int = 3

    val maiorValor = if(num1 > num2){
        println("proessando if")
        num1
    }else{
        println("proessando else")
        num2
    }
    println("O maior valor é $maiorValor")
}