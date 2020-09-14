class Exercicio1 {

    fun main(){

        var cliente1 = Cliente("Genielson","Leal dos Santos")

        var cliente2 = Cliente("Pedro ", "Henrique Sousa")

        var conta1 = Conta(123456,1500.0,cliente1)

        var conta2 = Conta(7891011,2000.00,cliente2)

        conta1.Deposito(1600.00)

        conta1.Saque(200.00)

        conta2.Deposito(1800.00)

        conta2.Saque(100.00)




    }

}