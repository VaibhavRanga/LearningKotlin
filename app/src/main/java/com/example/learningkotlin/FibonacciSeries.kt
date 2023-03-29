package com.example.learningkotlin

import java.util.Scanner

class FibonacciSeries {
}



//Prints the fibonacci series up to a number
/*fun main() {
    println("Enter the number up to which you want the Fibonacci series")
    val numEnd = Scanner(System.`in`).nextInt()
    var num1 = 0
    var num2 = 1
    if (numEnd >= 1) {
        when (numEnd) {
            1 -> {
                println(num1)
                println(num2)
                println(num2)
            }
            else -> {
                println(num1)
                println(num2)
                while (true) {
                    val temp = num1
                    num1 = num2
                    num2 = num1 + temp
                    if (num2 > numEnd) {
                        break
                    }
                    println(num2)
                }
            }
        }
    } else {
        println("Invalid input")
    }
}*/







//Prints first n terms of fibonacci series
fun main() {
    println("Enter the number of terms of fibonacci series you want to print")
    val numberOfTerms = Scanner(System.`in`).nextInt()
    var num1 = 0
    var num2 = 1
    var count = 3
    when (numberOfTerms) {
        1 -> {
            println(num1)
        }
        2 -> {
            println(num1)
            println(num2)
        }
        else -> {
            println(num1)
            println(num2)
            while (count <= numberOfTerms) {
                val temp = num1
                num1 = num2
                num2 = temp + num1
                println(num2)
                count++
            }
        }
    }
}
