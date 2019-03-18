package kz.pashim.data.keyboard

interface Keyboard {
    fun isMechanic(): Boolean
}

data class KeyboardType(
        val color: String,
        val weight: Int,
        val isMechanic: Boolean
) {
    companion object {
        val keyboardTypes: MutableList<KeyboardType> = mutableListOf(
                KeyboardType("red", 12, true),
                KeyboardType("white", 14, true),
                KeyboardType("black", 11, false),
                KeyboardType("gray", 11, false)
        )

        fun getKeyboardType(color: String, weight: Int, isMechanic: Boolean): KeyboardType {
            var keyboardType = keyboardTypes.find { it.color == color && it.weight == weight && it.isMechanic == isMechanic }
            if (keyboardType == null) {
                keyboardType = KeyboardType(color, weight, isMechanic)
                keyboardTypes.add(keyboardType)
            }
            return keyboardType
        }
    }
}

data class QwertyKeyboard(var keyboardName: String, var keyboardId: Long, val type: KeyboardType): Keyboard {
    override fun isMechanic(): Boolean = type.isMechanic

    override fun toString(): String = "$keyboardName: ${type.color} ${type.weight} ${type.isMechanic}"
}