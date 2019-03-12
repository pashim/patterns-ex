package kz.pashim.patterns.structural.singleton

import kz.pashim.patterns.structural.factory.AppleGadgetFactory
import kz.pashim.patterns.structural.factory.MiGadgetFactory
import kz.pashim.patterns.structural.factory.PhoneVersion
import java.lang.IllegalArgumentException

class GadgetShop private constructor() {

    companion object {
        val instance = GadgetShop()
    }

    fun buySmartPhone(args: Array<String>) {
        val factory = when (args.first()) {
            "apple" -> AppleGadgetFactory()
            "mi" -> MiGadgetFactory()
            else -> throw IllegalArgumentException()
        }

        print("${factory.createSmartPhone(PhoneVersion.V2).getInfo()} is ready to use")
    }
}