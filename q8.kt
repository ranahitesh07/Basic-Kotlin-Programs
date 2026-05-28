fun main() {

    var number = 45718
    var count = 0

    while (number != 0) {
        number = number / 10
        count++
    }
    println("Total Digits = $count")
}