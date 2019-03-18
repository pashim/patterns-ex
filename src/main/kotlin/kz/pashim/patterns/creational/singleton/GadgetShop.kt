package kz.pashim.patterns.creational.singleton

import kz.pashim.data.gadget.Gadget
import kz.pashim.data.gadget.SmartPhone
import kz.pashim.patterns.creational.factory.AppleGadgetFactory
import kz.pashim.patterns.creational.factory.MiGadgetFactory
import kz.pashim.patterns.creational.factory.PhoneVersion
import kz.pashim.patterns.structural.composite.ItemBoxComposite
import java.lang.IllegalArgumentException

open class GadgetShop protected constructor() {

    // Singleton initializes after first call
    companion object {
        val instance = GadgetShop()
    }

    open fun buySmartPhone(args: Array<String>): SmartPhone {
        val factory = when (args.first()) {
            "apple" -> AppleGadgetFactory()
            "mi" -> MiGadgetFactory()
            else -> throw IllegalArgumentException()
        }

        return factory.createSmartPhone(PhoneVersion.V2).also {
            println("${it.getInfo()} is ready to use")
        }
    }

    fun collectGadgets(vararg gadgets: Gadget): ItemBoxComposite {
        val boxComposite = ItemBoxComposite()
        fillRecursive(boxComposite, gadgets.asList())
        return boxComposite
    }

    private fun fillRecursive(boxComposite: ItemBoxComposite, items: List<Gadget>) {
        if (items.isEmpty()) return

        val halfSize = items.size / 2
        if (halfSize != 0) {
            boxComposite.add(items.subList(0, halfSize))
            val innerBox = ItemBoxComposite()
            boxComposite.addBox(innerBox)
            fillRecursive(ItemBoxComposite(), items.subList(halfSize, items.size - 1))
        }
    }
}