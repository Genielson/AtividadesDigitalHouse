fun main(){
    var numeros = IntArray(3)

    for ( i in 0..2){
        println("Digite o ${i+1} valor : ")
        numeros[i] = readLine()!!.toInt()
    }

   var maiorNumero =  maiorValor(numeros)
    println("Maior valor : ${maiorNumero}")

}


fun maiorValor(a:IntArray) : Int? {

    var maiorValor = a.maxOrNull()

    return maiorValor

}