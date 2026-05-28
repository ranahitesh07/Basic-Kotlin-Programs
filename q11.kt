fun main() {

    var number = 74518
    var sum = 0

    while (number != 0) {
        val digit = number % 10
        sum = sum + digit
        number = number / 10
    }

    println("Sum of Digits = $sum")
}