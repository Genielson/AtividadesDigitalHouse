import kotlin.random.Random

fun main(){
    /*
    var listaConta = arrayListOf<ContaBancaria> ()

    var conta = ContaCorrente(12346,2000.00,5.00)
    var conta2 = ContaCorrente(12346789,2000.00,5.00)

    var conta3  = ContaPoupanca(78910,300.00,5.00)
    var conta4  = ContaPoupanca(78910,300.00,5.00)

    var relatorio = Relatorio()

    conta.depositar(4.00)
    conta2.depositar(5.00)
    conta3.depositar(5.00)
    conta4.depositar(5.00)

    conta.sacar(4.00)
    conta2.sacar(4.00)
    conta3.sacar(4.00)
    conta4.sacar(4.00)

    relatorio.gerarRelatorio(conta)


     */

    var banco = Banco()
    var relatorio = Relatorio()

    do {

        banco.menuConta()

        var resposta = readLine()!!.toInt()

        when(resposta){

            1 -> {

                var contaPoupanca = 1

                println("Qual tipo de conta deseja criar? [ 1 = POUPANÇA / 2 = CORRENTE] ")
                var tipoConta = readLine()!!.toInt()

                if(tipoConta == contaPoupanca){

                    println("Por favor, digite o numero da conta : ")
                    var numeroConta = readLine()!!.toInt()

                    println("Por favor, digite o limite da conta : ")
                    var limiteConta = readLine()!!.toDouble()

                    var saldoInicial = 0.0

                    var contaPoupancaCliente = ContaPoupanca(numeroConta,saldoInicial,limiteConta)

                    banco.inserir(contaPoupancaCliente)
                    println("CONTA ṔOUPANÇA CRIADA COM SUCESSO! ")

                }else{

                    println("Por favor, digite o numero da conta : ")
                    var numeroConta = readLine()!!.toInt()

                    println("Por favor, digite a taxa de operacao da conta : ")
                    var taxaOperacao = readLine()!!.toDouble()

                    var saldoInicial = 0.0


                    var contaCorrenteCliente = ContaCorrente( numeroConta,saldoInicial,taxaOperacao)

                    banco.inserir(contaCorrenteCliente)
                    println("CONTA CORRENTE CRIADA COM SUCESSO! ")

                }



            }

            2 -> {

                println("Por favor, informe o numero da sua conta :  ")
                var numeroConta = readLine()!!.toInt()

                banco.selecionarConta(numeroConta)



            }

            3 -> {

                println("Por favor, informe o numero da sua conta :  ")
                var numeroConta = readLine()!!.toInt()

                if(banco.verificaLista(numeroConta) >= 0){

                    banco.remover(banco.listaConta[banco.verificaLista(numeroConta)])

                }else{

                    println("ESSA CONTA NÃO EXISTE ")

                }




            }

            4 -> {
                relatorio.gerarRelatorio(banco)

            }



        }

    }while (resposta != 5)


}



