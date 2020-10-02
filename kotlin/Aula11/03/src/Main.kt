fun main(){

    var listaAlunos = ArrayList<Aluno>()

    var aluno1 = Aluno("Genielson",123)
    var aluno2 = Aluno("Lucas",345)
    var aluno3 = Aluno("Maria",654)
    var aluno4 = Aluno("Mario",543)

    var aluno5 = Aluno("Mario",543)


    listaAlunos.add(aluno1)
    listaAlunos.add(aluno2)
    listaAlunos.add(aluno3)
    listaAlunos.add(aluno4)

    println(listaAlunos.contains(aluno5))

    // Apos o override retorna true no contains










}