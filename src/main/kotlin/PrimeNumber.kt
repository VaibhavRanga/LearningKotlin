import java.util.Scanner

class PrimeNumber {
}

fun main() {
    println("Enter a positive integer")
    val number = Scanner(System.`in`).nextInt()

    if (number <= 0) {
        println("Invalid input")
    } else if (number == 1) {
        println("Not a prime number")
    } else if (number == 2){
        println("Prime number")
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
}
