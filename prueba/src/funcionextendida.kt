fun main(args: Array<String>) {
    //Se puede enviar un valor por defecto
    val cadena=""
    cadena.hola()
}
//Nueva funcion hola() a String
fun String.hola(){
    print("Hola función extendida \n")
}