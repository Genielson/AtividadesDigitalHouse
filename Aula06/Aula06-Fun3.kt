fun main() {
    print("Informe a taxa de imposto: ")
    var taxaImposto = readLine()!!.toDouble()
    print("Informe o custo do produto: ")
    var custoProduto = readLine()!!.toDouble()
    println("O custo total é de R$ ${"%.2f".format(somaImposto(taxaImposto, custoProduto))}")
}

fun somaImposto(taxaImposto: Double, custoProduto: Double): Double
{
    return custoProduto + (custoProduto * (taxaImposto / 100))
}