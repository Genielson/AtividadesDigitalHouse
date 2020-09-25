class Prova {

    fun somaTotal(conjuntoDeInteiros: MutableSet<Int>):Int{
        var somatorio = 0
        conjuntoDeInteiros.forEach {
            somatorio = somatorio + it
        }

        return somatorio

    }

}