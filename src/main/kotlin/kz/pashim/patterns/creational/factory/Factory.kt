package kz.pashim.patterns.creational.factory

import kz.pashim.data.gadget.*
import kz.pashim.patterns.creational.abstractFactory.GadgetFactory
import kz.pashim.patterns.creational.builder.GadgetDirector
import kz.pashim.patterns.creational.builder.Mi8Builder
import kz.pashim.patterns.creational.builder.RedmiBuilder

class AppleGadgetFactory: GadgetFactory {
    override fun createSmartPhone(version: PhoneVersion): SmartPhone = IPhone()

    override fun createTablet(version: TabletVersion): Tablet = IPad()
}

class MiGadgetFactory: GadgetFactory {
    override fun createSmartPhone(version: PhoneVersion): SmartPhone {
        val smartPhoneBuilder = when (version) {
            PhoneVersion.V1 -> Mi8Builder()
            PhoneVersion.V2 -> RedmiBuilder()
            else -> throw IllegalArgumentException()
        }

        return GadgetDirector().buildSmartPhone(smartPhoneBuilder)
    }

    override fun createTablet(version: TabletVersion): Tablet = MiPad()
}

enum class PhoneVersion {
    V1, V2, V3
}

enum class TabletVersion {
    V1, V2
}