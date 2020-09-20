class Curso( var nome:String, var professor: Professor) {

    val aulas get() = ArrayList<Aula>()
    val aluno get() = ArrayList<Aluno>()

}