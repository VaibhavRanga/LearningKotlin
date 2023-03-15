package com.example.learningkotlin

import java.util.Scanner

class ExerciseOne {
}
fun main() {
    calculator()
}

fun calculator () {
    val scan = Scanner(System.`in`)
    do {
        println("Enter 1 for addition, 2 for subtraction, 3 for multiplication or 4 for division")
        val operator = scan.nextInt()

        println("Enter first number")
        val num1 = scan.nextFloat()
        println("Enter second number")
        val num2 = scan.nextFloat()

        when (operator) {
            1 -> println("Addition result: ${num1 + num2}")
            2 -> println("Subtraction result: ${num1 - num2}")
            3 -> println("Multiplication result: ${num1 * num2}")
            4 -> println("Division result: ${num1 / num2}")
        }
        println("Enter 1 to continue or any other key to stop")
        val choice = scan.next()
        var run = false
        if (choice == "1") {
            run = true
        }
    } while (run)
}
