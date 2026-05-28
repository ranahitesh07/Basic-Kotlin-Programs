fun main() {

    var number = 71845
    var reverse = 0

    while (number != 0) {
        val digit = number % 10
        reverse = reverse * 10 + digit
        number = number / 10
    }
    println("Reversed Number = $reverse")
}