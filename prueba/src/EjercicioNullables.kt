import java.awt.Stroke

fun main(args: Array<String>) {
    //convertirCadenaMayuscula(null)
    //obtenerTamListas(ArrayList<Int>(), lista2 = null, numList = "Orlando")

    val (lista, cadOrg) = dividircadena("Orlando Noscue")
    println(lista[1])
    println(cadOrg)

    val (id, nombre, apellido) = crearCliente()
    println(id)
    println(nombre)
    println(apellido)

    val nombres = ArrayList<String>()
    nombres.add("Orlando")
    nombres.add("Luisa")

    val apellidos = Array(2, {""})
    apellidos[0]="Noscue"
    apellidos[1]="Ospina"

    val edades = IntArray(2, {0})
    edades [0]= 37
    edades [1]= 29

    val lstUsuarios = unirListas(nombres, apellidos, edades)
        //for (usuario in lstUsuarios){
          //  println(usuario)
        //}
    lstUsuarios.forEach { println(it) }

    //lambda funciones que no tienen nombre { }
    lstUsuarios.filter { it.length > 13 }.forEach { println(it) }
    lstUsuarios.map { it.substring(0, 5) }.forEach { println(it) }
}

fun unirListas(nombres:List<String>, apellidos : Array<String>, edades:IntArray): List<String>{

    val lstUsuarios = ArrayList<String>()

        for ((index, nombre) in nombres.withIndex()){
            lstUsuarios.add("$nombre ${apellidos[index]} ${edades[index]}")
        }
        return lstUsuarios
}

data class Cliente (val id:Int, val nombre:String, val apellido:String)
    fun crearCliente():Cliente{
        return Cliente(16893672, "Orlando", "Noscue")
    }

//asi hago para que me reciba valores nulos
fun convertirCadenaMayuscula(cadena:String?):String?{
            return cadena?.toUpperCase()
    }

fun dividircadena(cadenaOrg : String): Pair<List <String>, String>{
    val cadenas = cadenaOrg.split(" ")
    return Pair(cadenas, cadenaOrg)
    println(cadenas)
}

//  Any recibe cualquier tipo de dato, pero solo una vez recibe, solo sigue recibiendo del tipo de dato inicial
//  ? indica que puede recibir null
//  List<Int?> aca puedo tener un elemento nulo
//  List<Int>? aca toda la lista puede ser nulo
fun obtenerTamListas(list1:List<Int?>, lista2:List<Int>?, numList : Any){
    val long1 = list1.size
    val long2 = lista2?.size ?:0

    //Para asegurar que el tipo de dato sea String
    if (numList is String){
        println(numList.toUpperCase())
    }

    //Esto es lo mismo que el lo ue hay en el IF
    val cad = numList as? String ?:""


    //Así recorro una lista
    for (num in list1){
        println(num)
    }
}