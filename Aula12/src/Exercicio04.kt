fun main(){

    var listaPecas = mutableListOf<Peca>()

    var peca = Peca("ABC","001")
    var peca2 = Peca("DEF","002")

    listaPecas.add(peca)
    listaPecas.add(peca2)

    var guardaVolumes = GuardaVolumes()

    guardaVolumes.guardarPecas(listaPecas)

    guardaVolumes.mostrarPecas(1)
    guardaVolumes.devolverPecas(1)
    guardaVolumes.mostrarPecas(1)




}