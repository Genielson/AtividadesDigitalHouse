class Concessionaria(var veiculo: Veiculo,var cliente: Cliente,var valor: Double) {


    fun registrarVenda(){

       Venda(this.cliente,this.veiculo,this.valor)

    }


}