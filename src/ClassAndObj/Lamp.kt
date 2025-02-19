package ClassAndObj

fun main() {
    val l1 = Lamp()

    l1.displayStatus()

    l1.turnOn()
    l1.turnOff()

    l1.displayStatus()
}

class Lamp {
    // data members
    private var isOn: Boolean = false

    // member functions
    fun turnOn() {
        if (isOn) println("Lamp is Already On")
        else {
            println("Turned On the Lamp")
            isOn = true
        }
    }

    fun turnOff() {
        if (!isOn) println("Lamp is Already Off")
        else {
            println("Turned Off the Lamp")
            isOn = false
        }
    }

    fun displayStatus() {
        if (isOn) println("Lamp is On")
        else println("Lamp is Off")
    }
}