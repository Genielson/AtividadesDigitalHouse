fun main(){

    
    var auxiliar = 0;

    for(i in 1..5){

        var valor = realine()!!.toInt()

        if(valor >= auxiliar){
            auxiliar = valor;
        }

    }

    println(" Maior valor : $auxiliar ")

}