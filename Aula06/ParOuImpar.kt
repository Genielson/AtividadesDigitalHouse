fun main(){

    var numero = readLine()!!.toInt()

    println(verificaParOuImpar(numero))

}

fun verificaParOuImpar(a:Int) : Boolean = if (a % 2 == 0) true else false