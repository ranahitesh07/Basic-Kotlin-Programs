open class Employee(val baseSalary: Int)

class Manager : Employee(50000)

fun main() {
    
    val manager = Manager()
    println("Manager Salary: ${manager.baseSalary}")
}