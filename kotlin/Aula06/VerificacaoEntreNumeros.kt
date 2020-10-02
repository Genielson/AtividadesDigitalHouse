fun main(){

    var numA = readLine()!!.toInt()
    var numB = readLine()!!.toInt()
    var numC = readLine()!!.toInt()
    var numD = readLine()!!.toInt()

    println(VerificaNumero(numA,numB,numC,numD))

}

fun VerificaNumero(numA:Int,numB:Int,numC:Int,numD:Int) : Boolean{

    if((numA > numC && numA > numD) || numB > numC && numB > numD ) {
        return true
    }else{
        return false
    }

}