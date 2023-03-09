import kotlin.math.pow

class Practice {
}

fun main() {
    var tempNumber = 153
    var count = 0
    var result = 0
    while (tempNumber > 0) {
        tempNumber /= 10
        println(tempNumber)
        count++
    }
    tempNumber = 153
    while (tempNumber > 0) {
        val remainder = tempNumber % 10
        result += (remainder.toDouble().pow(count)).toInt()
        tempNumber /= 10
    }
}
