package kz.pashim.patterns.behavioral.chain_of_responsibility

interface CallAnswer {
    fun answer(question: String): String
}

class AnswerPhone(private val nextHandler: CallAnswer = Operator()): CallAnswer {
    override fun answer(question: String): String {
        return if (question == "answerPhone") {
            "AnswerPhone"
        } else {
            nextHandler.answer(question)
        }
    }
}

class Operator(private val nextHandler: CallAnswer = Master()): CallAnswer {
    override fun answer(question: String): String {
        return if (question == "answerPhone") {
            "AnswerPhone"
        } else {
            nextHandler.answer(question)
        }
    }
}

class Master: CallAnswer {
    override fun answer(question: String): String = "I'm master"
}