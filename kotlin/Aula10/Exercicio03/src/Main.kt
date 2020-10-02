fun main(){

    var estoque = Estoque("arroz",5,3)

    var estoque2 = Estoque("feijao",3,10)

    var estoque3 = Estoque("milho",-2,8)

    var estoque4 = Estoque("cafe",10,25)

    estoque.repor(10)

    estoque2.darBaixa(3)

    println(estoque2.precisaRepor())

    estoque3.mudarNome("frango")

    println(estoque4.mostrar())

}