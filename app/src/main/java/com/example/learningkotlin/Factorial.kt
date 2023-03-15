package com.example.learningkotlin

import java.util.Scanner

class Factorial {
}

fun main() {
    println("Enter a number to calculate the factorial")
    val num = Scanner(System.`in`).nextInt()
    var factorial = 1
    for (i in 1 .. num) {
        factorial *= i
    }
    println("Factorial of $num is: $factorial")
}
