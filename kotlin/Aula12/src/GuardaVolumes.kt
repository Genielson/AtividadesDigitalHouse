class GuardaVolumes {

    private var listaVolume: MutableMap<Int,MutableList<Peca>> = mutableMapOf()
    private var contador = 0;

    fun guardarPecas(listaDePeca:MutableList<Peca>):Int{
        
        contador++
        this.listaVolume.put(contador,listaDePeca)
        println("PEÇA(S) INSERIDA(S) COM SUCESSO! ")

        return contador;

    }

    fun mostrarPecas(numero:Int){

       if(this.listaVolume.containsKey(numero)){

           this.listaVolume[numero]?.forEach {
                    println()
                    println("marca : ${it.marca}")
                    println("marca : ${it.modelo}")
                    println()
           }

        }else{

           println("A chave especificada nao existe ")

       }


    }

    fun devolverPecas(numero: Int){

        if(this.listaVolume.containsKey(numero)){
            println()
            this.listaVolume.remove(numero)
            println("Peca removida com sucesso! ")
        }else{
            println("A chave especificada nao existe ")
        }

    }

}