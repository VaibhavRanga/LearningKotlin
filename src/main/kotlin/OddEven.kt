import java.util.Scanner

class OddEven {
}

fun main() {
    println("Enter a number")
    val number = Scanner(System.`in`).nextInt()
    if (number % 2 == 0) println("Even number") else println("Odd number")
}