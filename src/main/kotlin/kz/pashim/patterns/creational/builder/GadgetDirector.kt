package kz.pashim.patterns.creational.builder

import kz.pashim.data.gadget.SmartPhone

class GadgetDirector {
    fun buildSmartPhone(builder: SmartPhoneBuilder): SmartPhone =
            builder.apply {
                buildProcessor()
                buildCamera()
                buildBody()
                buildKeyboard()
            }.assemble()
}