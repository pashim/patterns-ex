package kz.pashim.patterns.structural.abstractFactory

import kz.pashim.data.gadget.SmartPhone
import kz.pashim.data.gadget.Tablet
import kz.pashim.patterns.structural.factory.PhoneVersion
import kz.pashim.patterns.structural.factory.TabletVersion

interface GadgetFactory {
    fun createSmartPhone(version: PhoneVersion): SmartPhone
    fun createTablet(version: TabletVersion): Tablet
}
