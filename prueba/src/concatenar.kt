fun main(args: Array<String>) {

    //Las variables se declaran aquí
    val cadena = "Hola"
    val resp = cadena.concatenar("Mundo")
    print(resp)
}
//Nueva función Concatenar
fun String.concatenar (cadena:String) : String{
    return "$this $cadena"
}