fun main() {

    var numero1: Int = 0;

    var numero2: Int = 0;

    println("Informe o primeiro número: ");

    numero1 = readLine()!!.toInt();

    println("Informe o segundo número: ");

    numero2 = readLine()!!.toInt();

    numero1++;

    numero2--;

    for(i in numero1..numero2) {

        println("${i} ");

    }

}