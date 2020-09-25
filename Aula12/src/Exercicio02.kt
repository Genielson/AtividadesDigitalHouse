fun main(){

    var listaNumeros = mutableListOf<Int>()

    listaNumeros.add(1)
    listaNumeros.add(5)
    listaNumeros.add(5)
    listaNumeros.add(6)
    listaNumeros.add(7)
    listaNumeros.add(8)
    listaNumeros.add(8)
    listaNumeros.add(8)

    listaNumeros.forEach {
        println(it)
    }

    println()

    var listaSemRepeticoes = mutableSetOf<Int>()

    listaSemRepeticoes.add(1)
    listaSemRepeticoes.add(5)
    listaSemRepeticoes.add(5)
    listaSemRepeticoes.add(6)
    listaSemRepeticoes.add(7)
    listaSemRepeticoes.add(8)
    listaSemRepeticoes.add(8)
    listaSemRepeticoes.add(8)

    listaSemRepeticoes.forEach {
        println(it)
    }

    // Imprime sem repeticoes

    

}