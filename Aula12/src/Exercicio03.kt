fun main(){
   var listaNumerosParaSomar = mutableSetOf<Int>()

    listaNumerosParaSomar.add(1)
    listaNumerosParaSomar.add(2)
    listaNumerosParaSomar.add(3)
    listaNumerosParaSomar.add(4)
    listaNumerosParaSomar.add(5)
    listaNumerosParaSomar.add(6)

    var prova1 = Prova()

    println(prova1.somaTotal(listaNumerosParaSomar))

}