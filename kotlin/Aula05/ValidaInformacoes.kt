fun main() {

    var nome: String = "";

    var idade: Int = 0;

    var salario: Double = 0.0;

    var sexo: String = "";

    var estadoCivil: String = "";

    nome = solicitarNome();

    idade = solicitarIdade();

    salario = solicitarSalario();

    sexo = solicitarSexo();

    estadoCivil = solicitarEstadoCivil();

    exibirPessoa(nome, idade, salario, sexo, estadoCivil);

}

fun solicitarNome(): String {

    var nome: String = "";

    do {

        println("Informe um nome com mais de 3 letras: ")

        nome = readLine()!!.toString();

    } while (3 > nome.length);

    return nome;

}

fun solicitarIdade(): Int {

    var idade: Int = 0;

    do {

        println("Informe uma idade entre 0 e 150: ")

        idade = readLine()!!.toInt();

    } while ((idade <= 0) || (idade >= 150));

    return idade;

}

fun solicitarSalario() : Double {

    var salario: Double = 0.0;

    do {

        println("Informe um salário maior que zero: ")

        salario = readLine()!!.toDouble();

    } while (salario < 0);

    return salario;

}

fun solicitarSexo() : String {

    var sexo: String = "";

    do {

        println("Informe o sexo F para Feminino e M para Masculino:  ")

        sexo = (readLine()!!.toString()).toUpperCase();

    } while (!(sexo == "F" || sexo == "M"));

    return sexo;

}

fun solicitarEstadoCivil () : String {

    var estadoCivil: String = "";

    do {

        println("Informe o estado civil: s para Solteiro, c para Casado, v para Viuvo, d para Divorciado");

        estadoCivil = (readLine()!!.toString()).toUpperCase();

    } while (!(estadoCivil == "S" || estadoCivil == "C" || estadoCivil == "V" || estadoCivil == "D"));

    return estadoCivil;

}

fun exibirPessoa( nome: String, idade: Int, salario: Double, sexo: String, estadoCivil: String) {

    println("Nome: $nome");

    println("Idade: $idade");

    println("Salário: $salario");

    println("Sexo: $sexo");

    println("Estado Civil: $estadoCivil");

}
