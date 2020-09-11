fun solicitarSexo() : String {

    var sexo: String = "";

    do {

        println("Informe o sexo F para Feminino e M para Masculino:  ")

        sexo = (readLine()!!.toString()).toUpperCase();

    } while (!(sexo == "F" || sexo == "M"));

    return sexo;

}