fun main() {

    val a = 7
    val b = 18
    val c = 15

    if (a >= b && a >= c) {
        println("$a is largest")
    }
    else if (b >= a && b >= c) {
        println("$b is largest")
    }
    else {
        println("$c is largest")
    }
}