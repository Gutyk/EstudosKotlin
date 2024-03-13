package fundamentos.controle

fun main(){
    val nota: Double = 9.4

    if (nota in 9.0..10.0){
        println("Fantastico")
    }else if (nota in 7.0..8.0){
        println("Parabens")
    }else if (nota in 4.0..6.0){
        println("Nhe")
    }else if (nota in 0.0..3.0){
        println("Paia")
    }else{
        println("Nota invalida")
    }
}