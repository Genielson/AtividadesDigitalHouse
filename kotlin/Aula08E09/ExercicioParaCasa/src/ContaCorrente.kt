class ContaCorrente(numeroConta:Int, protected var saldo:Double, private val taxaDeOperacao:Double) : ContaBancaria(numeroConta,saldo) {


    override fun sacar(valor: Double):Boolean {
        if(valor < saldo + taxaDeOperacao) {
            println("saldo insuficiente")
            return false
        }else{
            this.saldo -= valor + taxaDeOperacao
            return true
        }
    }

    override fun depositar(valor: Double):Boolean {
         if( saldo + valor >= taxaDeOperacao) {
             saldo += valor - taxaDeOperacao
             return true
         }else{
             println("quantia insuficiente")
             return false
         }
    }

    override fun transferir(valor: Double,contaBancaria: ContaBancaria):Boolean {

        if(saldo >= valor){
            sacar(valor)
            contaBancaria.depositar(valor)
            return true
        }else{
            println(" Saldo insuficiente ")
            return false
        }

    }

    override fun mostrarDados() {
        super.mostrarDados()
        println("Taxa operacao : "+taxaDeOperacao)
    }


}