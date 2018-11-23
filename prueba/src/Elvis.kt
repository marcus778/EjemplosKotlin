fun main(args: Array<String>) {
    convertirCadenaMayus(null)
}
//asi hago para que me retorne un valor
fun convertirCadenaMayus(cadena:String?):String{
    return cadena?.toUpperCase() ?: ""
}