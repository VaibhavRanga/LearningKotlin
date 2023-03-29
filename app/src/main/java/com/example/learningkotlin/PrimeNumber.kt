package com.example.learningkotlin

import java.util.Scanner

class PrimeNumber {
}

// checks whether a number is prime or not
/*fun main() {
    println("Enter a positive integer to check for prime")
    val number = Scanner(System.`in`).nextInt()
    if (number <= 0) {
        println("Invalid input")
    } else if (number == 1) {
        println("Not a prime number")
    } else {
        var isPrime = true
        for (i in 2 .. number / 2) {
            if (number % i == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) println("Prime number") else println("Not a prime number")
    }
}*/






//Prime numbers within a range
/*fun main() {
    println("Enter the number from which you want to get the prime numbers\n(should be greater than 1)")
    val numStart = Scanner(System.`in`).nextInt()
    println("Enter the number up to which you want to get the prime numbers")
    val numEnd = Scanner(System.`in`).nextInt()
    if (numStart in 2 .. numEnd) {
        for (num in numStart .. numEnd) {
            var isPrime = true
            for (i in 2 .. num / 2) {
                if (num % i == 0) {
                    isPrime = false
                    break
                }
            }
            if (isPrime) {
                println(num)
            }
        }
    } else {
        println("Invalid range")
    }
}*/




//Prints first n prime numbers
fun main() {
    println("Enter how many prime numbers you want")
    val numberOfTerms = Scanner(System.`in`).nextInt()
    val infinity = Int.MAX_VALUE
    var count = 1
    for (current in 2 .. infinity) {
        var isPrime = true
        for (i in 2 .. current / 2) {
            if (current % i == 0) {
                isPrime = false
                break
            }
        }
        if (count > numberOfTerms) {
            break
        }
        if (isPrime) {
            count++
            println(current)
        }
    }
}
