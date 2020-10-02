class ContaPoupanca( numeroConta:Int, private var saldo:Double, private var limite:Double) : ContaBancaria(numeroConta,saldo)  {


    override fun sacar(valor: Double):Boolean {
        if(valor < (this.saldo+this.limite)){
            saldo -= valor
            return true
        }else{
            println("saldo insuficiente")
            return false
        }
    }

    override fun depositar(valor: Double):Boolean {
       saldo += valor
        return true
    }


    override fun transferir(valor: Double,conta:ContaBancaria):Boolean {

        if(saldo >= valor){
            sacar(valor)
            conta.depositar(valor)
            return true
        }else{
            println(" Saldo insuficiente ")
            return false
        }

    }

    override fun mostrarDados() {
        super.mostrarDados()
        println("Limite : ${limite}")
    }

}