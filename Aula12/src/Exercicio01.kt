fun main(){

    val listaObjetos = mutableMapOf<Int,String>(
            0 to "Ovo",
            1 to "Agua",
            2 to "Escopeta",
            3 to "Cavalo",
            4 to "Dentista",
            5 to "Fogo"
    )

    listaObjetos.forEach{
        println(it.key)
        println(it.value)
    }


    var listaNomes = mutableMapOf<String,List<String>>( "Joao" to listOf("one", "two", "three", "four"),
            "Miguel" to listOf("one", "two", "three", "four"),
            "Maria" to listOf("one", "two", "three", "four"),
            "Lucas" to listOf("one", "two", "three", "four")
    )

    listaNomes.forEach {
        println(it.key)
        println(it.value)
    }





}