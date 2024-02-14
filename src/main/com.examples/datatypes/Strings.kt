package com.example.helloworld.datatypes

class Strings
    fun main(){
        val aString: String = "Hello String\n"
        print(aString)

        val aMultilinedString = """
             for (c in "foo")
                print(c)
        """;
        println(aMultilinedString.trimIndent())

        // "|" it's used by default as margin prefix
        val text = """
            |Tell me and I forget.
            |Teach me and I remember.
            |Involve me and I learn.
            |(Benjamin Franklin)
            """.trimMargin()
        println(text)

        val s = "abc"
        println("$s has the length ${s.length}") // template expressions

        // Formats to add zeroes and make a length of seven
        val integerNumber = String.format("%07d", 31416)
        println("formatted integerNumber = "+integerNumber)
    }