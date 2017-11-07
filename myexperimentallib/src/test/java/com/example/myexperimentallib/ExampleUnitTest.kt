package com.example.myexperimentallib

import org.junit.Test

import org.junit.Assert.*

class ExampleUnitTest {
    val joiner = StringsJoiner(";")

    @Test
    @Throws(Exception::class)
    fun join_isCorrect() {
        assertEquals("aaa;b;123;s", joiner.join(listOf("aaa", "b", "123", "s")))
    }
}