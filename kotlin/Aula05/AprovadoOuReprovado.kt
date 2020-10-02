fun main() {

    print("Digite a primeira nota: ")
    var nota1= readLine()!!.toDouble()
    print("Digite a segunda nota: ")
    var nota2= readLine()!!.toDouble()

    var media = (nota1.absoluteValue + nota2.absoluteValue) / 2
    println("Sua média é $media.")

    if( media >= 7 && media < 10) {
        println("Aprovado")
    } else if (media < 7) {
        println("Reprovado")
    } else {
        println("Aprovado com Distinção")
    }


}