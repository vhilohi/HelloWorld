package com.example.helloworld.datatypes

class Numbers
    fun main(){
        //Integer types
        // if no type is specified, this is automatically inferred by the compiler
        val one = 1 // Int
        val threeBillion = 3_000_000 // Long
        val oneLong = 1L
        val oneByte: Byte = 1

        //Floating types
        val pi = 3.14 // automatically inferred by the compiler as Double
        val piFloat = 3.14f

        fun printDouble(doubleValue: Double){
            println(doubleValue)
        }

        printDouble(3.14)
        // not allowed, smaller types are NOT implicitly converted to bigger ones
        //printDouble(1)
        //printDouble(3.14f)

        val a: Int = 1 // in the JVM stored as int
        val boxedA: Int? = 1 // when creating null reference such as Int? is boxed in Java classes, this case Integer
        val anotherBoxedA: Int? = 1
        println(boxedA===anotherBoxedA) // true because uses Integer pool (-128, 127)

        println(5/2)
        println(5/2.toFloat())

       }
