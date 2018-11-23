//se declara el nonbre:tipo de dato
fun main(args: Array<String>) {
    //Las variables se declaran val ó var

    val arrNums = IntArray(size = 2)
        arrNums[0]=5
        arrNums[1]=10
        buscarMayor(arrNums)
}

fun buscarMayor(arrNums : IntArray){
    var tempMayor = 0

    for (elemento in arrNums)
        if (elemento > tempMayor){
            //return tempMayor
        }
    //println( elemento )
}