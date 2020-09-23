fun main(){

    var listaFuncionario = ArrayList<Funcionario>()

    var funcionario1 = Funcionario("Genielson",1234)
    var funcionario2 = Funcionario("Pedro",3445)
    var funcionario3 = Funcionario("Gabriel",7655)
    var funcionario4 = Funcionario("Eduardo",8765)

    var funcionario5 = Funcionario("Leon",1234)

    listaFuncionario.add(funcionario1)
    listaFuncionario.add(funcionario2)
    listaFuncionario.add(funcionario3)
    listaFuncionario.add(funcionario4)

    if(listaFuncionario.contains(funcionario5)){
        listaFuncionario.add(funcionario5)
    }else{
        println("Não foi encontrado! ")
    }













}