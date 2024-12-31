import kotlin.Int

fun day4_part1(input: String): Int {
  val chars: List<List<Char>> = input.lines().map { line -> line.toCharArray().toList() }

  val targetWord = "XMAS"

  var count = 0
  chars.forEachIndexed { i, line ->
    line.forEachIndexed { j, c ->
      if (c == 'X') {
        for (k in -1..1) {
          for (l in -1..1) {
            if (chars.containsTarget(i, j, targetWord, k, l)) {
              println("$i $j $c")
              count++
            }
          }
        }
      }
    }
  }

  return count
}

fun List<List<Char>>.isIndexOutOfBounds(i: Int, j: Int): Boolean {
  return i < 0 || i > this.size - 1 || j < 0 || j > this[i].size - 1
}

fun List<List<Char>>.containsTarget(
    i: Int,
    j: Int,
    target: String,
    iDirection: Int,
    jDirection: Int
): Boolean {
  if (target.isEmpty()) {
    return true
  }

  if (this.isIndexOutOfBounds(i, j)) {
    return false
  }

  val c = target.toCharArray().first()
  if (c != this[i][j]) {
    return false
  }

  return this.containsTarget(
      i + iDirection, j + jDirection, target.removeRange(0, 1), iDirection, jDirection)
}

fun day4_part2(input: String): Int {
  return 0
}
