class Aluno(val nome:String, val numero:Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Aluno

        if (numero != other.numero) return false

        return true
    }

    override fun hashCode(): Int {
        return numero
    }
}