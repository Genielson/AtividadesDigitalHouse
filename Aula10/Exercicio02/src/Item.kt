class Item(var numeroItem:Int,var descricaoItem:String,var quantidadeComprada:Int, var precoUnitario:Double) {

    init{

        this.quantidadeComprada = Math.max(0,quantidadeComprada)
        this.precoUnitario = Math.max(0.0,precoUnitario)

    }

}