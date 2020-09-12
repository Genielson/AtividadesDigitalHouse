fun main() {

    print(" Digite um número: ")
    var numero = readLine()!!.toInt()
    println(checaPositivoNegativo(numero))
}

fun checaPositivoNegativo(numero:Int) = if (numero > 0) "P" else "N"
