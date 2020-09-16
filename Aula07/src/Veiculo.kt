class Veiculo(var marca:String,var modelo:String) {
    var anoFabricacao:Int = 0
    var cor:String = ""
    var quilometragem:Double = 0.0

    constructor(marca: String,modelo: String,anoFabricacao:Int,cor:String,quilometragem:Double):this(marca,modelo){
        this.anoFabricacao = anoFabricacao
        this.cor = cor
        this.quilometragem = quilometragem
    }

}