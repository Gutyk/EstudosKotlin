package fundamentos

fun main(){

    //If and Else
    var a = 6
    var b = 6

    var max: Int



    /* Maneira comum
    max = a

    if(a < b) {
        max = b
    }else{
        print("Ambos possuem valores iguais")
    }
    */

    max = if(a > b) a else b

    print(max)



    //When
    var x = 1

    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> {
            print("x is neither 1 nor 2")
        }
    }
}