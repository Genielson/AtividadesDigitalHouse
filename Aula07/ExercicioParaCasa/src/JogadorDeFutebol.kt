class JogadorDeFutebol(var nome:String) {

    var alegria:String = ""
    var gols:Int = 0
    var energia:Int = 0
    var experiencia = 0

    constructor(nome:String,energia:Int,alegria:String,gols:Int,experiencia:Int):this(nome){
        this.energia = energia
        this.alegria = alegria
        this.gols = gols
        this.experiencia = experiencia

    }

    fun FazerGol(){

        this.alegria += 10
        this.energia -= 5
        this.gols += 1
        println("GOOOOOOOOL")
    }

    fun Correr(){
        this.energia -= 10
        println("Cansei")
    }







}