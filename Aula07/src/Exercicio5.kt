fun main(){

    var carro = Veiculo("Honda","Civic",1999,"preto",1000.00)

    var cliente = Cliente("Genielson","Leal","86999197289")

    var concessionaria = Concessionaria(carro,cliente,60000.00)
    concessionaria.registrarVenda()




}