fun main() {

    var number = 141
    val original = number
    var reverse = 0

    while (number != 0) {

        val digit = number % 10
        reverse = reverse * 10 + digit
        number = number / 10
    }

    if (original == reverse) {
        println("Palindrome Number")
    } else {
        println("Not a Palindrome")
    }
}