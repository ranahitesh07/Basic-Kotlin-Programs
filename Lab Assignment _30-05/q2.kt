class Thermostat {

    var temperature: Double = 25.0
        private set

    fun setTemperature(value: Double) {
        temperature = value
    }
}

fun main() {
    val room = Thermostat()
    room.setTemperature(30.0)

    println("Temperature: ${room.temperature}")
}