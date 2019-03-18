package kz.pashim.patterns.structural.decorator

import kz.pashim.data.gadget.SmartPhone
import kz.pashim.patterns.creational.singleton.GadgetShop

class GadgetShopDecorator: GadgetShop() {

    fun buySmartPhoneAndLogIt(args: Array<String>): SmartPhone =
            super.buySmartPhone(args).also {
        print("$it sold")
    }
}
