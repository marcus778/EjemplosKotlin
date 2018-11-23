
//se declara el nonbre:tipo de dato
fun main(args: Array<String>) {
    //Se puede enviar un valor por defecto
}

// el void aca es Unit
fun operaciones(operador : String,
                num1: Int,
                num2: Int){
    // operaciones con operador
    val result = when (operador){
        "suma" -> num1 + num2
        "resta" -> num1 - num2
        "mult" -> num1 * num2
        else -> -1
    }
    //String template
    print ("El resultado es: $result \n")
}
