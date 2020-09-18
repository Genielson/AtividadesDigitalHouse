class Conta(var numConta:Int,var saldo:Double,var titular:Cliente) {

    fun Deposito(quantia:Double){
        this.saldo += quantia
        println("DEPOSITO REALIZADO COM SUCESSO! ")
        println(" SEU SALDO ATUAL : ${this.saldo} ")
    }

    fun Saque(quantia:Double) {
        if (this.saldo >= quantia) {
            this.saldo = this.saldo - quantia
            println("SAQUE REALIZADO COM SUCESSO")
            println(" SEU SALDO ATUAL : ${this.saldo} ")
        }else{

            println("Saldo insuficiente")

        }
    }



}