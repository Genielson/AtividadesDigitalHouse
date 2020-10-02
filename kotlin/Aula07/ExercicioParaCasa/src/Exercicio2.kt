fun main(){
    var jogador1 = JogadorDeFutebol("Cristiano Ronaldo")
    var jogador2 = JogadorDeFutebol("Lionel Messi")

    var sessaoTreino1 = SessaoTreinamento(10.0)
    var sessaoTreino2 = SessaoTreinamento(20.0)

    sessaoTreino1.TreinarA(jogador1)
    sessaoTreino2.TreinarA(jogador2)

}