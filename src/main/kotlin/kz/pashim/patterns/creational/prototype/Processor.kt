package kz.pashim.patterns.creational.prototype

interface Processor {
    fun getInfo(): String
    fun clone(): Processor
}

class SnapdragonProcessor constructor(var name: String, var cores: Int): Processor {

    constructor(processor: SnapdragonProcessor): this(processor.name, processor.cores)

    override fun getInfo(): String = "Snapdragon Processor"

    override fun clone() = SnapdragonProcessor(this)
}