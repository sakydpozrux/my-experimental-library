package com.example.myexperimentallib

/**
 * Created by sakydpozrux on 07/11/2017.
 */
class StringsJoiner(private val separator: String) {
    fun join(strings: List<String>): String {
        return strings.joinToString(separator)
    }
}