package me.anviks.codewars._7kyu.two_oldest_ages

/*
 * https://www.codewars.com/kata/511f11d355fe575d2c000001
 */

fun twoOldestAges(ages: List<Int>): List<Int> {
  return ages.sortedDescending().subList(0, 2).sorted()
}
