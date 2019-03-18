package kz.pashim.patterns.behavioral.observer

import kz.pashim.patterns.behavioral.iterator.Person
import kz.pashim.patterns.behavioral.iterator.SulpakSubscribersIterator

class SulpakMessageService {
    fun sendToSubscribers() {
        val iterator = SulpakSubscribersIterator.instance
        val specificPerson = Person()
        iterator.addSubscriber(specificPerson)
        iterator.addSubscriber(Person())
        iterator.addSubscriber(Person())
        iterator.addSubscriber(Person())
        iterator.removeSubscriber(specificPerson)

        while (iterator.hasNext()) {
            val person = iterator.next()
            println("Sending message to: " + person.id).also { person.update(" updated") }
        }
    }
}