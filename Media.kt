fun main(){

    println("Quanto vale sua hora? ")
    var nota1 = readLine()!!.toDouble()

    println("Quantas horas voce trabalhou? ")
    var nota2 = readLine()!!.toDouble()

    println("Digite a nota 3 :")
    var nota3 = readLine()!!.toDouble()
    println("Digite a nota 4 :")
    var nota4 = readLine()!!.toDouble()

    var media = (nota1+nota2+nota3+nota4) / 4

    println("A media é "+media)
    
}