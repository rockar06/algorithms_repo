package reverseinteger

fun main(args: Array<String>) {
    val numberToInvert = 12341785
    print("Original integer: $numberToInvert")
    println()
    print("Inverted integer: ${ReverseInteger.reverse(numberToInvert)}")
}

object ReverseInteger {

    fun reverse(x: Int): Int {
        var number: Int = x
        var result = 0
        while (number != 0) {
            val pop = number % 10
            number /= 10
            if (result > Int.MAX_VALUE / 10 || (result == Int.MAX_VALUE / 10 && pop > 7)) return 0
            if (result < Int.MIN_VALUE / 10 || (result == Int.MIN_VALUE / 10 && pop > 8)) return 0
            result = result * 10 + pop
        }
        return result
    }
}