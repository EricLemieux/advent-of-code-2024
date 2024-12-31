import kotlin.test.Test
import kotlin.test.assertEquals

class Day4KtTest {
  @Test
  fun `part 1 sample`() {
    val input =
        """
          MMMSXXMASM
          MSAMXMSMSA
          AMXSXMAAMM
          MSAMASMSMX
          XMASAMXAMM
          XXAMMXXAMA
          SMSMSASXSS
          SAXAMASAAA
          MAMMMXMMMM
          MXMXAXMASX
        """
            .trimIndent()
    val result = day4_part1(input)
    assertEquals(18, result)
  }

  @Test
  fun `part 1`() {
    val input = object {}.javaClass.getResource("day-4-part-1.txt")?.readText().toString()
    val result = day4_part1(input)
    assertEquals(2336, result)
  }

  @Test
  fun `part 2 sample`() {
    val result = day4_part2("")
    assert(result == -1) { "Expected ___ but got $result" }
  }

  @Test
  fun `part 2`() {
    val input = object {}.javaClass.getResource("day-4-part-1.txt")?.readText().toString()
    val result = day4_part2(input)
    assert(result == -1) { "Expected ___ but got $result" }
  }
}
