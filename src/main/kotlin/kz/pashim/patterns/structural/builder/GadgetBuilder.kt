package kz.pashim.patterns.structural.builder

import kz.pashim.data.gadget.IPhone
import kz.pashim.data.gadget.MiPhone
import kz.pashim.data.gadget.Redmi
import kz.pashim.data.gadget.SmartPhone

interface SmartPhoneBuilder {
    fun buildProcessor()
    fun buildCamera()
    fun buildBody()
    fun buildKeyboard()
    fun assemble(): SmartPhone
}

class Mi8Builder: SmartPhoneBuilder {
    override fun buildProcessor() { println("Building Snapdragon 845...") }

    override fun buildCamera() { println("Building Mi Dual Camera...") }

    override fun buildBody() { println("Building Mi Body...") }

    override fun buildKeyboard() { println("Building Sensor keyboard...") }

    override fun assemble(): SmartPhone = MiPhone()

}

class RedmiBuilder: SmartPhoneBuilder {
    override fun buildProcessor() { println("Building Redmi CPU...") }

    override fun buildCamera() { println("Building Redmi Dual Camera ...") }

    override fun buildBody() { println("Building Redmi Body...") }

    override fun buildKeyboard() { println("Building Sensor keyboard...") }

    override fun assemble(): SmartPhone = Redmi()

}