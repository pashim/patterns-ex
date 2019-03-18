package kz.pashim.patterns.creational.abstractFactory

import kz.pashim.data.gadget.SmartPhone
import kz.pashim.data.gadget.Tablet
import kz.pashim.patterns.creational.factory.PhoneVersion
import kz.pashim.patterns.creational.factory.TabletVersion

interface GadgetFactory {
    fun createSmartPhone(version: PhoneVersion): SmartPhone
    fun createTablet(version: TabletVersion): Tablet
}
