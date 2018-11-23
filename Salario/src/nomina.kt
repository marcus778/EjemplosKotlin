fun main(args: Array<String>) {
    //menu()
    imprimirCuentas()
}

data class Empleado(val name: String, val age: Int, val sexo: String, val nhijos: Int, val dtrabajados: Int, val salariobase: Int)


    fun Empleado.imprimir() =
        "Nombre = ${this.name} - Edad = ${this.age} - Sexo = ${this.sexo} - N-hijos = ${this.nhijos} - D-trabajados = ${this.dtrabajados}"

    val lstEmpleado = ArrayList<Empleado>()

    fun imprimirCuentas() {
        lstEmpleado.forEach { println(it.imprimir()) }
}



    fun crearEmpleado(){

        println("Digite Nombre")
        val name = readLine() ?: ""
        println("Digite Edad")
        val age = readLine() ?.toInt()?: 0
        println("Digite Sexo")
        val sexo = readLine() ?: ""
        println("Digite Número de hijos")
        val nhijos = readLine() ?.toInt()?: 0
        println("Digite Días trabajados")
        val dtrabajados = readLine() ?.toInt()?: 0
        val salariobase = dtrabajados * (780000/30)

        lstEmpleado.add(Empleado(name, age, sexo, nhijos, dtrabajados, salariobase))
    }

