import kotlin.test.Test
import kotlin.test.assertEquals

class Day4KtTest {
  val sampleInput =
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

  @Test
  fun `part 1 sample`() {
    val result = day4_part1(sampleInput)
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
    val result = day4_part2(sampleInput)
    assertEquals(9, result)
  }

  @Test
  fun `part 2`() {
    val input = object {}.javaClass.getResource("day-4-part-1.txt")?.readText().toString()
    val result = day4_part2(input)
    assertEquals(1831, result)
  }
}
