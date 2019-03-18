package kz.pashim.patterns.behavioral

interface NotificationStrategy {
    fun notifyUsers()
}

class EmailNotificationStrategy: NotificationStrategy {
    override fun notifyUsers() {
        print("sending email to users...")
    }
}

class SmsNotificationStrategy: NotificationStrategy {
    override fun notifyUsers() {
        print("sending sms to users...")
    }
}

class TelegramNotificationStrategy: NotificationStrategy {
    override fun notifyUsers() {
        print("sending message to users...")
    }
}

class Context {
    var notificationStrategy: NotificationStrategy = EmailNotificationStrategy()

    fun setStrategy(strategy: NotificationStrategy) {
        this.notificationStrategy = strategy
    }

    fun executeStrategy() {
        notificationStrategy.notifyUsers()
    }
}