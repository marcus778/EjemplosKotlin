fun main(args: Array<String>) {

    val readOnly: List<String> = listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    val read : List<String> = listOf("Lunes", "Martes")
    val rsize = readOnly.size //Muestra el tamaño de la lista
    println ("El tamaño de la lista es: $rsize")

    val rget = readOnly.get(3) //Devuelve el valor de la posición 3
    println("El valor en la posición 3 es: $rget")

    val rfirst = readOnly.first() //Devuelve el primer valor
    println("El primer vaolor de la lista es: $rfirst")

    val rlast = readOnly.last() //Devuelve el último valor
    println("El último valor de la lista es: $rlast")
    println("Este es el contenido de la lista: $readOnly") //[Lunes, Martes, Miércoles, Jueves, Viernes, Sábado, Domingo]
}

fun compararListas(){
    
}



