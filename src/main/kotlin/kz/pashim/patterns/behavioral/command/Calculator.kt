package kz.pashim.patterns.behavioral.command

class Calculator(var num: Double) {
    companion object {
        var instance = Calculator(0.0)
    }

    fun plus(value: Double): Double {
        this.num = this.num.plus(value)
        return this.num
    }

    fun minus(value: Double): Double {
        this.num = this.num.minus(value)
        return this.num
    }

    fun multiply(value: Double): Double {
        this.num = this.num.times(value)
        return this.num
    }

    fun divide(value: Double): Double {
        this.num = this.num.rem(value)
        return this.num
    }
}

abstract class Command {
    val calculator: Calculator = Calculator.instance

    abstract fun execute()
}

class AdditionCommand(private val value: Double) : Command() {
    override fun execute() {
        calculator.plus(value)
    }
}

class MultiplicationCommand(private val value: Double) : Command() {
    override fun execute() {
        calculator.multiply(value)
    }
}