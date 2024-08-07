/*
 * https://www.codewars.com/kata/55eeddff3f64c954c2000059
 */

package me.anviks.codewars.solutions._6kyu.sum_consecutives

fun sumConsecutives(s: List<Int>): List<Int> =
    s.foldIndexed<Int, MutableList<Int>>(mutableListOf()) { i, acc, element ->
        if (i == 0 || s[i - 1] != element) {
            acc.add(element)
        } else {
            acc[acc.size - 1] += element
        }
        acc
    }.toList()
