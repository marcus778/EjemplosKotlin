//se declara el nombre:tipo de dato
fun main(args: Array<String>) {

    //Las variables se declaran aquí
    val resultmayor = evaluarNumMayor(10, 10)
    val resultmenor = evaluarNumMenor(num3=5, num4=10)
    val igualess = iguales(6, 5)
    println("El número mayor es: ${resultmayor}")
    println("El número menor es: ${resultmenor}")

}

fun evaluarNumMayor(num1:Int, num2:Int): Int{
    if (num1 > num2){
        return num1
    }else if (num2 > num1){
        return num2
    }else{
        return  -1
    }
}

fun evaluarNumMenor(num3: Int, num4: Int): Int{
    if (num3 < num4){
        return num3
    }else if (num4<num3){
        return num4
    }else{
        return -1
    }
}
fun iguales (num1: Int, num2: Int): Int{
    if (num1==num2) {
        return num1
        println("Los números son iguales")
    }else {
        return -1
    }
}