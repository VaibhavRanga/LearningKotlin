package com.example.learningkotlin

import java.util.Scanner
import kotlin.math.pow

class ArmstrongNumber {
}

/*
//Checks whether a given number is an armstrong number or not
fun main() {
    val scan = Scanner(System.`in`)
    println("Enter a positive integer to check for armstrong")
    val number = scan.nextInt()
    val numberOfDigits = number.toString().length
    var i = 10
    var digit = 0
    var power = 0
    var numberOfZeros = 1
    for (j in 1 .. numberOfDigits) {
        numberOfZeros *= 10
    }
    while (i <= numberOfZeros) {
        if (i == 10) {
            digit = number % i
        } else {
            var tempDigit = number % i
            tempDigit = (tempDigit - digit) * 10 / i
            digit = tempDigit
        }
        power += (digit.toDouble().pow(numberOfDigits)).toInt()
        i *= 10
    }
    if (number == power) {
        println("It is an armstrong number")
    } else {
        println("It is not an armstrong number")
    }
}*/






//Checks whether a given number is an armstrong number or not
/*fun main() {
    println("Enter a positive number")
    val number = Scanner(System.`in`).nextInt()
    var tempNumber = number
    var count = 0
    var result = 0
    while (tempNumber > 0) {
        tempNumber /= 10
        count++
    }
    tempNumber = number
    while (tempNumber > 0) {
        val remainder = tempNumber % 10
        result += (remainder.toDouble().pow(count)).toInt()
        tempNumber /= 10
    }
    if (number == result) {
        println("It is an armstrong number")
    } else {
        println("It is not an armstrong number")
    }
}*/






//Prints armstrong numbers in a range
/*fun main() {
    println("Enter the number from which you want to get the armstrong numbers (greater than 0")
    val numStart = Scanner(System.`in`).nextInt()
    println("Enter the number up to which you want to get the armstrong numbers")
    val numEnd = Scanner(System.`in`).nextInt()
    if (numStart in 0..numEnd) {
        for (number in numStart .. numEnd) {
            var tempNumber = number
            var count = 0
            var result = 0
            while (tempNumber > 0) {
                tempNumber /= 10
                count++
            }
            tempNumber = number
            while (tempNumber > 0) {
                val remainder = tempNumber % 10
                result += (remainder.toDouble().pow(count)).toInt()
                tempNumber /= 10
            }
            if (number == result) {
                println(number)
            }
        }
    } else {
        println("Invalid range")
    }
}*/







//Prints armstrong numbers in a range
/*fun main() {
    println("Enter the start of range (greater than 0)")
    val scan = Scanner(System.`in`)
    val rangeStart = scan.nextInt()
    println("Enter the end of range (greater than 0)")
    val rangeEnd = scan.nextInt()
    if (rangeStart in 1 .. rangeEnd) {
        val arrayOfArmstrong = ArrayList<Int>()
        for (number in rangeStart .. rangeEnd) {
            if (checkArmstrong(number)) {
                arrayOfArmstrong.add(number)
            }
        }
        println(arrayOfArmstrong)
    } else {
        println("Invalid range")
    }
}
fun checkArmstrong(number: Int): Boolean {
    var tempNumber = number
    var count = 0
    while (tempNumber > 0) {
        tempNumber /= 10
        count++
    }
    tempNumber = number
    var remainder = 0
    var sum = 0
    while (tempNumber > 0) {
        remainder = tempNumber % 10
        sum += remainder.toDouble().pow(count).toInt()
        tempNumber /= 10
    }
    return number == sum
}*/








//First n armstrong numbers.
/*fun main() {
    println("Enter how many armstrong numbers you want to print")
    val numberOfTerms = Scanner(System.`in`).nextInt()
    var numCount = 0
    var current = 1
    while (current > 0) {
        var result = 0
        var count = 0
        var tempNumber = current
        while (tempNumber > 0) {
            tempNumber /= 10
            count++
        }
        tempNumber = current
        while (tempNumber > 0) {
            val remainder = tempNumber % 10
            result += (remainder.toDouble().pow(count)).toInt()
            tempNumber /= 10
        }
        if (current == result ) {
            println(current)
            numCount++
        }
        if (numCount == numberOfTerms) {
            break
        }
        current++
    }
}*/







//Prints first n armstrong numbers
/*fun main() {
    println("Enter n")
    val requiredTerms = Scanner(System.`in`).nextInt()
    var currentTerm = 1
    var number = 1
    val arrayOfArmstrong = ArrayList<Int>()
    while (currentTerm <= requiredTerms) {
        if (checkArmstrong(number)) {
            arrayOfArmstrong.add(number)
            currentTerm++
        }
        number++
    }
    println(arrayOfArmstrong)
}

fun checkArmstrong(number: Int): Boolean {
    var tempNumber = number
    var count = 0
    while (tempNumber > 0) {
        tempNumber /= 10
        count++
    }
    tempNumber = number
    var remainder: Int
    var sum = 0
    while (tempNumber > 0) {
        remainder = tempNumber % 10
        sum += remainder.toDouble().pow(count).toInt()
        tempNumber /= 10
    }
    return number == sum
}*/
