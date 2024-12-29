package com.lemieuxdev.adventofcode2024.day1

import kotlin.math.abs

fun day2_part1(input: String): Int {
  return input.lines().filter { isReportSafe(it) }.size
}

fun day2_part2(input: String): Int {
  return input.lines().filter { isReportMostlySafe(it) }.size
}

fun isReportSafe(report: String): Boolean {
  val nums = report.split(" ").map { it.toInt() }
  return isReportSafe(nums)
}

fun isReportSafe(nums: List<Int>): Boolean {
  if (!nums.allAscending() && !nums.allDescending()) {
    return false
  }

  nums.zipWithNext { a, b ->
    if (abs(a - b) > 3) {
      return false
    }
  }

  return true
}

fun isReportMostlySafe(report: String): Boolean {
  val nums = report.split(" ").map { it.toInt() }
  nums.forEachIndexed { key, value ->
    val subList = nums.toMutableList().apply { removeAt(key) }

    if (isReportSafe(subList)) {
      return true
    }
  }
  return false
}

fun List<Int>.allAscending(): Boolean {
  this.zipWithNext { a, b ->
    if (a >= b) {
      return false
    }
  }
  return true
}

fun List<Int>.allDescending(): Boolean {
  this.zipWithNext { a, b ->
    if (a <= b) {
      return false
    }
  }
  return true
}
