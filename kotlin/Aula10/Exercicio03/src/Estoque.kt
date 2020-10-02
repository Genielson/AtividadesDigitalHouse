class Estoque(var nome:String,var qtdAtual:Int,var qtdMinima:Int) {

     init{
         this.qtdAtual = Math.max(0,this.qtdAtual)
         this.qtdMinima = Math.max(0,this.qtdMinima)
     }

     fun mudarNome(nome:String){

         this.nome = nome

     }

    fun mudarQtdMinima(qtdMinima: Int){

        this.qtdMinima = qtdMinima

    }

    fun repor(qtd:Int){

        this.qtdAtual += qtd

    }

    fun darBaixa(qtd:Int){

        if(qtd < 0){

            throw Exception(" Quantidade incorreta ")

        }

        this.qtdAtual -= qtd

    }

    fun mostrar():String{

        return "Nome: ${this.nome} | Quantidade Minima : ${this.qtdMinima} | Quantidade Atual : ${this.qtdAtual}"

    }

    fun precisaRepor():Boolean{

        if(this.qtdAtual < this.qtdMinima){
            return true
        }else{
            return false
        }

    }

}