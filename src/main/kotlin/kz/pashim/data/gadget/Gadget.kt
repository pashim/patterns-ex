package kz.pashim.data.gadget

interface Gadget

interface SmartPhone: Gadget {
    fun getInfo(): String
}

interface AppleSmartPhone : SmartPhone
interface MiSmartPhone : SmartPhone

class IPhone : AppleSmartPhone {
    override fun getInfo(): String = "Apple IPhone"
}

class MiPhone : MiSmartPhone {
    override fun getInfo(): String = "Xiaomi Mi Phone"
}

class Redmi : MiSmartPhone {
    override fun getInfo(): String = "Xiaomi Redmi"
}

interface Tablet: Gadget {
    fun getInfo(): String
}

interface AppleTablet : Tablet
interface MiTablet : Tablet

class IPad : AppleTablet {
    override fun getInfo(): String = "Apple IPad Mini"
}

class MiPad : MiTablet {
    override fun getInfo(): String = "Mi Pad"
}

interface Watch {
    fun getInfo(): String
}