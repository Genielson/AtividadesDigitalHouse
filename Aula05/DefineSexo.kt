fun main() {
    print("Digite F para feminino ou M para masculino: ")
    val letra = readLine()!!.toLowerCase();
    println("")
    if(letra == "f") {
        println("Feminino")
    } else if (letra == "m") {
        println("Masculino")
    }         else {
        println("Sexo inválido")
    }
}