import java.util.Scanner
import kotlin.math.pow

class ArmstrongNumber {
}

/*fun main() {
    val scan = Scanner(System.`in`)
    println("Enter a positive integer")
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


fun main() {
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
}
