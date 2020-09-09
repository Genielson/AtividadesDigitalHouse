fun main(){
	
	println("Digite o peso dos peixes:")
	var pesoTotalPeixe = readLine()!!.toDouble()

	var excesso = pesoTotalPeixe - 50

	println("Excedeu "+excesso+" KG")

	var totPagar = excesso * 4
	println("O valor a ser pago é de R$ "+totPagar)


}