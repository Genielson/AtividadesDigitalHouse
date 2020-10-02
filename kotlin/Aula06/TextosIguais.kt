fun main(){

    println("Digite a primeira String : ")
    var primeiroTexto = readLine()!!.toString()

    println("Digite a segunda String : ")
    var segundoTexto = readLine()!!.toString()

    var resultadoComparacao = ComparaStringsIguais(primeiroTexto,segundoTexto)

    println(resultadoComparacao)

}

fun ComparaStringsIguais(a:String,b:String) : Boolean = if (a.equals(b)) true else false


