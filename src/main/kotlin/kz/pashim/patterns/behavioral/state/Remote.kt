package kz.pashim.patterns.behavioral.state

interface TVState {
    fun powerClick()
    fun nextChannelClick()
    fun prevChannelClick()
}

class OffTVState: TVState{
    override fun powerClick() {
        println("Power ON!")
    }
    override fun nextChannelClick() {
        println("Power ON!")
    }
    override fun prevChannelClick() {
        println("Power ON!")
    }
}

class OnTVState: TVState{
    override fun powerClick() {
        println("Power OFF!")
    }
    override fun nextChannelClick() {
        println("Next channel!")
    }
    override fun prevChannelClick() {
        println("Prev channel!")
    }
}

class Remote {
    var state: TVState = OffTVState()

    fun powerClicked() = state.powerClick()
    fun nextClicked() = state.nextChannelClick()
    fun prevClicked() = state.prevChannelClick()

    fun changeState(state: TVState) {
        this.state = state
    }
}