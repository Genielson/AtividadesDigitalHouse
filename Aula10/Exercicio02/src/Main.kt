fun main(){

    var item1 = Item(1,"nada",5,-1.00)
    var item2 = Item(1,"nada",-5,200.00)

    var item3 = Item(1,"nada",5,-200.00)

    var item4 = Item(1,"nada",5,200.00)

    var lista = ArrayList<Item>()

    lista.add(item1)
    lista.add(item2)
    lista.add(item3)
    lista.add(item4)

    var fatura = Fatura(lista)
    println(fatura.getTotalFatura())

}