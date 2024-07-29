package me.anviks.codewars._6kyu.playing_with_passphrases

/*
 * https://www.codewars.com/kata/559536379512a64472000053
 */

import org.junit.Test
import kotlin.test.assertEquals

class PlayPassTest {

    @Test
    fun basicTests() {
        assertEquals("!!!VpZ FwPm j ", PlayPass.playPass(" I LOVE YOU!!!", 1))
        assertEquals("!!!uOy eVoL I", PlayPass.playPass("I LOVE YOU!!!", 0))
        assertEquals("zDdCcBbB", PlayPass.playPass("AAABBCCY", 1))
    }
}