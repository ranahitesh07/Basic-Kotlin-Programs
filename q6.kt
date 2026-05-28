fun main() {

    val number = 7
    var factorial = 1

    for (i in 1..number) {
        factorial = factorial * i
    }
    println("Factorial = $factorial")
}