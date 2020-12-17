package numberpalindrome

fun main(args: Array<String>) {
    val number = 121
    print("The number is palindrome? R= ${NumberIsPalindrome.isPalindrome(number)}")
}

class NumberIsPalindrome {

    companion object {

        fun isPalindrome(x: Int): Boolean {
            if (x < 0) return false
            var number = x
            var result = 0
            while (number != 0) {
                val pop = number % 10
                number /= 10
                if (result > Int.MAX_VALUE / 10 || (result == Int.MAX_VALUE / 10 && pop > 7)) return false
                if (result < Int.MIN_VALUE / 10 || (result == Int.MIN_VALUE / 10 && pop > 8)) return false
                result = result * 10 + pop
            }
            return x == result
        }
    }
}