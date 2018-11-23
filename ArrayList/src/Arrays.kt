fun main(args: Array<String>) {
    val weekDays = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
        println("Recoriendo el Array manualmente")
        println(weekDays.get(0))
        println(weekDays.get(1))
        println(weekDays.get(2))
        println(weekDays.get(3))
        println(weekDays.get(4))
        println(weekDays.get(5))
        println(weekDays.get(6))

        if(weekDays.size >= 8){
            println(weekDays.get(7))
        }else{
            println("no tiene más parámetros la array")
    }

    println("Recoriendo el Array con FOR")
    println(recorrerArray())

    println("Recoriendo el Array con FOR")
    println(buscar())


    val semana = arrayOf("Miercoles", "Jueves", "Viernes")
}
    fun recorrerArray(){
        val weekDays = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
            for ((posicion, valor) in weekDays.withIndex()) {
                println("La posición $posicion contiene el valor $valor")
        }
    }

    fun buscar (){
        val find = "Viernes"

    }
