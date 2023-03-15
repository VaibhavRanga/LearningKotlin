package com.example.learningkotlin

import java.util.Scanner

class OddEven {
}

//Odd or even numbers in a range
/*fun main() {
    println("Enter 1 for even numbers or 2 for odd numbers")
    val choice = Scanner(System.`in`).nextInt()
    when (choice) {
        1 -> {
            evenNumbers()
        }
        2 -> {
            oddNumbers()
        }
        else -> {
            println("Invalid choice")
        }
    }
}
fun evenNumbers() {
    println("Enter the number from which you want to get the even numbers\n" +
            "(should be greater than 0)")
    val numStart = Scanner(System.`in`).nextInt()
    println("Enter the number up to which you want to get the even numbers")
    val numEnd = Scanner(System.`in`).nextInt()
    if (numStart in 1 .. numEnd) {
        for (number in numStart..numEnd) {
            if (number % 2 == 0) {
                println(number)
            }
        }
    } else {
        println("Invalid range")
    }
}
fun oddNumbers() {
    println("Enter the number from which you want to get the odd numbers\n" +
            "(should be greater than 0)")
    val numStart = Scanner(System.`in`).nextInt()
    println("Enter the number up to which you want to get the odd numbers")
    val numEnd = Scanner(System.`in`).nextInt()
    if (numStart in 1 .. numEnd) {
        for (number in numStart..numEnd) {
            if (number % 2 != 0) {
                println(number)
            }
        }
    } else {
        println("Invalid range")
    }
}*/






//first n even or odd numbers
fun main() {
    println("Enter 1 for even numbers or 2 for odd numbers")
    val choice = Scanner(System.`in`).nextInt()
    when (choice) {
        1 -> {
            evenNumbers()
        }
        2 -> {
            oddNumbers()
        }
        else -> {
            println("Invalid choice")
        }
    }
}
fun evenNumbers() {
    println("Enter the number of terms you want e.g. 10")
    val numberOfTerms = Scanner(System.`in`).nextInt()
    val infinity = Int.MAX_VALUE
    var count = 0
    for (num in 1.. infinity) {
        if (num % 2 == 0) {
            println(num)
            count++
        }
        if (count >= numberOfTerms) {
            break
        }
    }
}
fun oddNumbers() {
    println("Enter the number of terms you want e.g. 10")
    val numberOfTerms = Scanner(System.`in`).nextInt()
    val infinity = Int.MAX_VALUE
    var count = 0
    for (num in 1.. infinity) {
        if (num % 2 != 0) {
            println(num)
            count++
        }
        if (count >= numberOfTerms) {
            break
        }
    }
}
