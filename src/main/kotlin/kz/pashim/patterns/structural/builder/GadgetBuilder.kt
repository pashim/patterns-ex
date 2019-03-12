package kz.pashim.patterns.structural.builder

import kz.pashim.data.gadget.MiPhone
import kz.pashim.data.gadget.Redmi
import kz.pashim.data.gadget.SmartPhone
import kz.pashim.patterns.structural.prototype.Processor
import kz.pashim.patterns.structural.prototype.SnapdragonProcessor

interface SmartPhoneBuilder {
    fun buildProcessor(): Processor
    fun buildCamera()
    fun buildBody()
    fun buildKeyboard()
    fun assemble(): SmartPhone
}

class Mi8Builder: SmartPhoneBuilder {
    override fun buildProcessor() =
            SnapdragonProcessor("Snapdragon 845", 4).also { println("Building Snapdragon 845...") }

    override fun buildCamera() { println("Building Mi Dual Camera...") }

    override fun buildBody() { println("Building Mi Body...") }

    override fun buildKeyboard() { println("Building Sensor keyboard...") }

    override fun assemble(): SmartPhone = MiPhone()

}

class RedmiBuilder: SmartPhoneBuilder {
    override fun buildProcessor() =
            SnapdragonProcessor("Stub processor", 4).also { println("Building IPhone Bionic Processor...") }

    override fun buildCamera() { println("Building Redmi Dual Camera ...") }

    override fun buildBody() { println("Building Redmi Body...") }

    override fun buildKeyboard() { println("Building Sensor keyboard...") }

    override fun assemble(): SmartPhone = Redmi()

}