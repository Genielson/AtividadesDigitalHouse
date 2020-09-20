class Fatura(var lista:ArrayList<Item>) {

    fun getTotalFatura():Double?{

        var totalFatura:Double = 0.0

        for(i in lista){
            totalFatura += i.quantidadeComprada.toDouble() * i.precoUnitario
        }

        return totalFatura

    }


}