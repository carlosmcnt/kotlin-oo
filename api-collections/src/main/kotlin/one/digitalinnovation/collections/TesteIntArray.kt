package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0]=1
    values[1]=5
    values[2]=7
    values[3]=3
    values[4]=9

    println("------------ FORMA 1 ------------")
    for(valor in values){
        println(valor)
    }

    println("------------ FORMA 2 ------------")
    values.forEach { valor ->
        println(valor)
    }

    println("------------ FORMA 3------------")
    for(index in values.indices){
        println(values[index])
    }

    println("------------ ORDENAÇÃO ------------")
    values.sort()
    for(valor in values){
        println(valor)
    }
}