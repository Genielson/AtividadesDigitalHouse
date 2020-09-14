class SessaoTreinamento {

    var experiencia:Double = 0.0

    constructor(experiencia:Double){
        this.experiencia = experiencia
    }

    fun TreinarA(jogador:JogadorDeFutebol){

        jogador.Correr()
        jogador.FazerGol()
        jogador.Correr()
        this.experiencia += 1

    }



}