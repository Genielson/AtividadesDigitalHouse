import kotlin.random.Random

class Banco : Imprimivel {

    var listaConta = arrayListOf<ContaBancaria> ()

    override fun mostrarDados() {
        for(i in 0..(listaConta.size.toInt())-1){

            println("------------------")
            listaConta[i].mostrarDados()

        }
    }


    fun verificaLista(numeroConta: Int):Int{

        for(i in 0..(listaConta.size) - 1){

            if(listaConta[i].numeroConta == numeroConta ){
                return i
            }

        }

        return -1
    }

    fun procurarConta(numeroConta:Int): ContaBancaria? {

        var menorIndicePossivel = 0

        if(verificaLista(numeroConta) >= menorIndicePossivel ){
            return listaConta[verificaLista(numeroConta)]
        }else{
            return null
        }

    }

    fun selecionarConta(numeroConta:Int){

        var menorIndicePossivel = 0

        if(verificaLista(numeroConta) >= menorIndicePossivel){

            var relatorio = Relatorio()

            do {

                this.acoesConta()

                var resposta = readLine()!!.toInt()

                when(resposta){

                    1 -> {

                        println("Quanto quer depositar? ")
                        var valorDeposito = readLine()!!.toDouble()

                        listaConta[menorIndicePossivel].depositar(valorDeposito)

                        break

                    }

                    2 -> {

                        println("Quanto quer sacar? ")
                        var valorSaque = readLine()!!.toDouble()

                        listaConta[menorIndicePossivel].sacar(valorSaque)

                        break

                    }

                    3 -> {

                        println("Quanto quer transferir? ")
                        var valorTransferencia = readLine()!!.toDouble()

                        println("Qual numero da conta que quer? ")
                        var valorNumeroConta = readLine()!!.toInt()

                        if(this.verificaLista(valorNumeroConta) >= 0){
                            listaConta[menorIndicePossivel].transferir(valorTransferencia,listaConta[this.verificaLista(valorNumeroConta)])
                        }else{
                            println("Numero de conta inexistente")
                        }

                        break

                    }

                    4 -> {
                        relatorio.gerarRelatorio(listaConta[menorIndicePossivel])
                        break
                    }

                }

            }while(resposta != 5)

        }else{

            println(" Numero de conta inexistente ")

        }

    }

    fun inserir(conta:ContaBancaria){

       listaConta.add(conta)

    }

    fun acoesConta(){

        println(" ------------------ ")
        println(" 1 - DEPOSITAR ")
        println(" 2 - SACAR ")
        println(" 3 - TRANSFERIR ")
        println(" 4 - GERAR RELATORIO ")
        println(" 5 - FINALIZAR ")
        println(" ------------------ ")


    }

    fun menuConta(){

        println(" ------------------ ")
        println(" 1 - CRIAR CONTA ")
        println(" 2 - SELECIONAR CONTA ")
        println(" 3 - REMOVER CONTA ")
        println(" 4 - GERAR RELATORIO ")
        println(" 5 - FINALIZAR ")
        println(" ------------------ ")

    }

    fun remover(conta:ContaBancaria){

        listaConta.remove(conta)
        println("CONTA DELETADA COM SUCESSO! ")
    }


}