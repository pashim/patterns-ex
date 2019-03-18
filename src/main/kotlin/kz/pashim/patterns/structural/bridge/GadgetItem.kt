package kz.pashim.patterns.structural.bridge

open class GadgetItem(
        var name: String,
        val params: GadgetParams,
        val brand: GadgetBrand)

interface GadgetParams

class ShortParams(
        var weight: Int
): GadgetParams

class FullParams(
        var size: Int,
        var weight: Int
): GadgetParams

interface GadgetBrand {
    fun getInfo()
}

class ShortBrandInfo(var brandName: String) : GadgetBrand {
    override fun getInfo() { println(brandName) }
}

class FullBrandInfo(var brandName: String, var sinceYear: Int) : GadgetBrand {
    override fun getInfo() { println(brandName) }
    fun getCompanyInfo() { println("${brandName} since ${sinceYear}")}
}