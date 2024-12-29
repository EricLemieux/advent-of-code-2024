package com.lemieuxdev.adventofcode2024.day1

import kotlin.Int

fun day3_part1(input: String): Int {
  val r = Regex("""mul\((\d+),(\d+)\)""")
  return r.findAll(input)
      .map { (it.groups[1]?.value?.toInt() ?: 0) * (it.groups[2]?.value?.toInt() ?: 0) }
      .sum()
}

fun day3_part2(input: String): Int {
  var enabled = true
  var sum = 0
  val r = Regex("""(mul\((\d+),(\d+)\)|do\(\)|don't\(\))""")
  r.findAll(input).forEach {
    val methodName = Regex("""(.*)\(""").find(it.value)?.groups[1]?.value ?: ""
    when (methodName) {
      "do" -> enabled = true
      "don't" -> enabled = false
      "mul" -> {
        if (enabled) {
          sum += (it.groups[2]?.value?.toInt() ?: 0) * (it.groups[3]?.value?.toInt() ?: 0)
        }
      }
    }
  }
  return sum
}
