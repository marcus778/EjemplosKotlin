//se declara el nombre:tipo de dato
fun main(args: Array<String>) {

    //Las variables se declaran aquí
    val operaciones = Operaciones2(5, 5)
    print("Suma ${operaciones.sumar()}\n")
    print("Resta ${operaciones.restar()}\n")
    print("Multiplicación ${operaciones.multiplicar()}\n")
    print("División ${operaciones.dividir()}\n")
}
//Asi se declaran las clases
class Operaciones2(val num1:Int, val num2:Int){
    fun sumar(): Int{ return num1 + num2 }
    fun restar(): Int{ return num1 - num2 }
    fun multiplicar(): Int{ return num1 * num2 }
    fun dividir():Int{ return num1 / num2 }
}