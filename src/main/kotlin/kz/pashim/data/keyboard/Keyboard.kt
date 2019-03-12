package kz.pashim.data.keyboard

interface Keyboard {
    fun isMechanic(): Boolean
}

class QwertyKeyboard: Keyboard {
    override fun isMechanic(): Boolean = true
}

class SensorKeyboard: Keyboard {
    override fun isMechanic(): Boolean = false
}
