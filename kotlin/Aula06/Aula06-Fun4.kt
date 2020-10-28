fun main() {
    print("Rolar dados? (s ou n)")
    var resposta = readLine()!!.toString()
    if resposta.toUpperCase() = "S" {
        var valor = rolaDados()

    }

}

fun rolaDados():Int {
    return Random.nextInt(2,12)
}

fun verificaResultado(valor: Int): String {
    when (valor) {
        2, 3, 12 -> return "Você tirou ${valor}! Você perdeu =("
        7, 11 -> return "Você tirou ${valor}! Parabéns você ganhou!"
        else -> return "Você tirou ${valor}! Aperte enter para tentar novamente"
    }
 }

fun segundoRound(valor:Int)