fun main() {
    print("Digite um número: ")
    var parImpar = readLine()!!.toInt()
    if(parImpar % 2 == 0) {
        println("É par")
    } else {
        println("É ímpar")
    }
}