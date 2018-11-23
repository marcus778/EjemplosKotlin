
fun main(args: Array<String>) {

    //Las variables se declaran aquí
    val usuario = Usuario("Orlando", "Noscue Trochez")

    print("Hola ${usuario.nombre} ${usuario.apellido} \n")
}

//Creacion de Clases
data class Usuario (val nombre : String,
                    val apellido : String)
