package week6task

fun main(){
    println(inLove(6,6))
    println(inLove(5,13))
    println(inLove(22,17))

}

    fun inLove(petal1: Int, petal2 : Int){
       when{(petal1 % 2 == 0 && petal2 % 2 == 1 || petal1 % 2 == 1 && petal2 % 2 == 0) ->
       println(true)
           else -> println(false)
       }
}