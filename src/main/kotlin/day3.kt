package com.lemieuxdev.adventofcode2024.day1

import kotlin.Int

fun day3_part1(input: String): Int {
  val r = Regex("""mul\((\d+),(\d+)\)""")
  return r.findAll(input)
      .map { (it.groups[1]?.value?.toInt() ?: 0) * (it.groups[2]?.value?.toInt() ?: 0) }
      .sum()
}

fun day3_part2(input: String): Int {
  val r = Regex("""(?<command>mul|do|don't)\((?<content>[,0-9]*)\)""")
  return r.findAll(input).fold(Pair(0, true)) { (value, enabled), match ->
     when (match.groups["command"]?.value) {
      "do" -> Pair(value, true)
      "don't" -> Pair(value, false)
      "mul" if enabled -> {
        val content = match.groups["content"]?.value?.split(",")
        val one = content?.getOrNull(0)?.toInt() ?: 0
        val two = content?.getOrNull(1)?.toInt() ?: 0
        Pair(value + (one*two), enabled)
      }
      else -> Pair(value, enabled)
    }
  }.first
}
