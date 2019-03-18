package kz.pashim.patterns.structural.composite

import kz.pashim.data.gadget.Gadget

open class ItemBox(var gadgets: List<Gadget>)

class ItemBoxComposite(var items: MutableList<Gadget> = mutableListOf(), var boxes: MutableList<ItemBox> = mutableListOf()) : ItemBox(items) {

    fun add(gadgets: List<Gadget>) {
        items.addAll(gadgets)
    }

    fun addBox(box: ItemBox) {
        boxes.add(box)
    }
}