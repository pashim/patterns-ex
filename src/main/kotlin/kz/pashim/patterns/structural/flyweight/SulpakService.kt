package kz.pashim.patterns.structural.flyweight

import kz.pashim.data.keyboard.KeyboardType
import kz.pashim.data.keyboard.QwertyKeyboard

class SulpakService {

    fun buildMultipleKeyboards() {
        val colors = arrayListOf("red", "black", "white", "gray")
        val weights = arrayListOf(12, 11, 14, 13)
        val mechanics = arrayListOf(true, false)

        val keyboards = mutableListOf<QwertyKeyboard>()

        for (i in 1..10000000) {
            keyboards.add(QwertyKeyboard(
                    "keyboard_$i", i.toLong(), KeyboardType.getKeyboardType(colors.random(), weights.random(), mechanics.random())
            ))
        }

//        for (keyboard: QwertyKeyboard in keyboards) {
//            println(keyboard)
//        }

        println(KeyboardType.keyboardTypes.size)
    }
}