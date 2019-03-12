package kz.pashim.patterns.structural.factory

import kz.pashim.data.gadget.*
import kz.pashim.patterns.structural.abstractFactory.GadgetFactory

class AppleGadgetFactory: GadgetFactory {
    override fun createSmartPhone(version: PhoneVersion): SmartPhone = IPhone()

    override fun createTablet(version: TabletVersion): Tablet = IPad()
}

class MiGadgetFactory: GadgetFactory {
    override fun createSmartPhone(version: PhoneVersion): SmartPhone =
            when(version) {
                PhoneVersion.V1 -> MiPhone()
                PhoneVersion.V2 -> Redmi()
                else -> throw IllegalArgumentException()
            }

    override fun createTablet(version: TabletVersion): Tablet = MiPad()
}

enum class PhoneVersion {
    V1, V2, V3
}

enum class TabletVersion {
    V1, V2
}