package kz.pashim.patterns.behavioral.iterator

import java.util.*

class Person(val id: UUID = UUID.randomUUID()) {
    override fun equals(other: Any?): Boolean {
        return this.id == (other as Person).id
    }

    fun update(msg: String) {
        println(id.toString() + msg)
    }
}

interface Iterator<T> {
    fun hasNext(): Boolean
    fun next() : T
}

class SulpakSubscribersIterator private constructor(private var subscribers: MutableList<Person>) : Iterator<Person> {
    private var current = 0

    override fun hasNext() = current < subscribers.size

    override fun next(): Person = subscribers[current++]

    companion object {
        val instance = SulpakSubscribersIterator(LinkedList())
    }

    fun addSubscriber(person: Person) {
        subscribers.add(person)
    }

    fun removeSubscriber(person: Person) {
        subscribers.remove(person)
    }
}