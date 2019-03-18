package kz.pashim.patterns.structural.adapter

import kz.pashim.data.gadget.SmartPhone
import kz.pashim.patterns.structural.bridge.GadgetItem
import kz.pashim.patterns.structural.bridge.ShortBrandInfo
import kz.pashim.patterns.structural.bridge.ShortParams

open class Delivery {
    fun deliver(item: GadgetItem) {
        println("${item.name} delivered")
    }
}

class ItemAdapter(phone: SmartPhone):
        GadgetItem(phone.getInfo(), ShortParams(10), ShortBrandInfo("Info"))