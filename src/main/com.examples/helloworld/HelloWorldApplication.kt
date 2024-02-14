package com.example.helloworld

class HelloWorldApplication

fun main(args: Array<String>) {
	println("Hello world!")

	println("Program argument: ${args.joinToString(";")}")

	println("What's your name?")
	val name = readln()
	println("Hello $name!")
}
