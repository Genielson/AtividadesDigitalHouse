class Prova(var dificuldade:Int,var energiaNecessaria:Int) {

    fun PodeRealizar(atleta: Atleta):Boolean{
        if(atleta.nivel >= this.dificuldade && energiaNecessaria >= 1){

            return true

        }else{

            return false

        }
    }

}