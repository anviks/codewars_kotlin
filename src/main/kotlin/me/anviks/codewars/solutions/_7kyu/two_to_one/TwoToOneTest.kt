/*
 * https://www.codewars.com/kata/5656b6906de340bd1b0000ac
 */

package me.anviks.codewars.solutions._7kyu.two_to_one

import org.junit.Assert.assertEquals
import org.junit.Test

class TwoToOneTest {
    @Test
    fun test() {
        println("longest Fixed Tests")
        assertEquals("aehrsty", longest("aretheyhere", "yestheyarehere"))
        assertEquals("abcdefghilnoprstu", longest("loopingisfunbutdangerous", "lessdangerousthancoding"))
        assertEquals("acefghilmnoprstuy", longest("inmanylanguages", "theresapairoffunctions"))
    }
}
