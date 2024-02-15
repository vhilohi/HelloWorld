package com.example.datatypes

class Arrays
    fun main(){
        var riversArray = arrayOf("Nile", "Amazon", "Danube")
        //creates a new riversArray,
        // copies over the original elements and adds "Mississippi"
        riversArray  += "Yangtze"
        println(riversArray.joinToString())

        val arrayOfNulls: Array<Int?> = arrayOfNulls(3)
        println(arrayOfNulls.joinToString())

        val emptyArray = emptyArray<String>()
        //or
        val anotherEmptyArray: Array<String> = emptyArray()

        val initArray = Array<Int>(3){0}
        println(initArray.joinToString())

        // ???
        val asc = Array(5){i -> (i*i).toString()}
        asc.forEach { println(it) }

        val nestedArray = Array(2){Array(3){0} }
        println(nestedArray.contentDeepToString())

        val simpleArray = arrayOf(0,0,0)
        val secondArray = Array(2){Array(2){1} }

        simpleArray[1] = 3
        secondArray[1][1] = 3

        println(simpleArray.contentDeepToString())
        println(secondArray.contentDeepToString())

        val letterArrays = arrayOf("c", "d")
        printAllLetters("a", "b", *letterArrays)
        
        val anotherSimpleArray = arrayOf(1,2,3)
        val anotherArray = arrayOf(1,2,3)

        println("\ndoes the array have the same elements? " + anotherSimpleArray.contentEquals(anotherArray))
        anotherSimpleArray[1] = 8
        println("does the array have the same elements after change?")
        println(anotherSimpleArray contentEquals anotherArray)

        val sumArray = arrayOf(1,2,3)
        println("sum af all elements ="+sumArray.sum())

        val shuffleArray = arrayOf(1,2,3,4,5)
        shuffleArray.shuffle()
        println("shuffled elements ="+ shuffleArray.joinToString())

        val arrayList = arrayOf("a", "b", "c", "c")
        println("convert to Set "+ arrayList.toSet())
        println("convert to List "+ arrayList.toList())

        val pairArray = arrayOf("apple" to 10, "cherry" to 20, "ginger" to 35)
        println("convert to Map "+ pairArray.toMap())
    }

fun printAllLetters(vararg strings: String) {
    for (string in strings)
        print(string)
}
