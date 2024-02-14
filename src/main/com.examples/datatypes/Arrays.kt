package com.example.helloworld.datatypes

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
    }