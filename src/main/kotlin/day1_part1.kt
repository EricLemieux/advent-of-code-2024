package com.lemieuxdev.adventofcode2024.day1

import kotlin.Int
import kotlin.math.abs

fun day1_part1(input: String): Int {
  val col1: MutableList<Int> = mutableListOf()
  val col2: MutableList<Int> = mutableListOf()
  input.lines().forEach {
    val left = it.substringBefore(" ").toInt()
    val right = it.substringAfterLast(" ").toInt()

    col1 += left
    col2 += right
  }
  col1.sort()
  col2.sort()
  return col1.zip(col2).sumOf { (left, right) -> abs(left - right) }
}

fun day1_part2(input: String): Int {
  var rightListOccurances: Map<Int, Int> = mutableMapOf()
  return 0
}
