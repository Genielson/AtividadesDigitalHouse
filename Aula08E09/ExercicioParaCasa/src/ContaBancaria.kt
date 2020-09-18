abstract class ContaBancaria( val numeroConta:Int, private var saldo:Double) : Imprimivel {


    abstract fun sacar(valor:Double):Boolean

    abstract fun depositar(valor:Double):Boolean

    abstract fun transferir(valor:Double,conta:ContaBancaria):Boolean

    override fun mostrarDados() {

        println("Saldo : ${saldo} ")
        println("Conta : ${numeroConta} ")
    }





}