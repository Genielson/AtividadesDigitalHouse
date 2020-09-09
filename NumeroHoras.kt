fun main(){

    println("Quanto vale sua hora? ")
    var valorHora = readLine()!!.toDouble()

    println("Quantas horas voce trabalhou? ")
    var totHoras = readLine()!!.toDouble()

    
    var salario = (valorHora * totHoras)

    println("voce receberá R$ "+salario)
    
}