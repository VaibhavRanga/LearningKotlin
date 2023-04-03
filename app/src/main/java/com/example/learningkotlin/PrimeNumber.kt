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






//Prime numbers within a range
/*fun main() {
    println("Enter start of range (greater than 1)")
    val scan = Scanner(System.`in`)
    val rangeStart = scan.nextInt()
    println("Enter the end of range (greater than 1)")
    val rangeEnd = scan.nextInt()
    if (rangeStart in 2 .. rangeEnd) {
        val arrayOfPrimes = ArrayList<Int>()
        for (i in rangeStart..rangeEnd) {
            if (checkPrime(i)) {
                arrayOfPrimes.add(i)
            }
        }
        println(arrayOfPrimes)
    } else {
        println("Invalid range")
    }
}
fun checkPrime(currentNumber: Int): Boolean {
    var isPrime = true
    for (i in 2 .. currentNumber / 2) {
        if (currentNumber % i == 0) {
            isPrime = false
            break
        }
    }
    return isPrime
}*/








//Prints first n prime numbers
/*fun main() {
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
}*/







//Prints first n prime numbers
/*fun main() {
    println("Enter n")
    val requiredCount = Scanner(System.`in`).nextInt()
    var currentCount = 1
    var number = 2
    val arrayOfPrimes = ArrayList<Int>()
    while (currentCount <= requiredCount) {
        if (checkPrime(number)) {
            arrayOfPrimes.add(number)
            currentCount++
        }
        number++
    }
    println(arrayOfPrimes)
}
fun checkPrime(currentNumber: Int): Boolean {
    var isPrime = true
    for (i in 2 .. currentNumber / 2) {
        if (currentNumber % i == 0) {
            isPrime = false
            break
        }
    }
    return isPrime
}*/
