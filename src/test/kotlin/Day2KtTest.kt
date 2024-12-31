import kotlin.test.Test

class Day2KtTest {
  val sampleInput =
      """
        7 6 4 2 1
        1 2 7 8 9
        9 7 6 2 1
        1 3 2 4 5
        8 6 4 4 1
        1 3 6 7 9
        """
          .trimIndent()

  @Test
  fun `part 1 sample`() {
    val result = day2_part1(sampleInput)
    assert(result == 2) { "Expected 2 but got $result" }
  }

  @Test
  fun `part 1`() {
    val input = object {}.javaClass.getResource("day-2-part-1.txt")?.readText().toString()
    val result = day2_part1(input)
    assert(result == 463) { "Expected 463 but got $result" }
  }

  @Test
  fun `part 2 sample`() {
    val result = day2_part2(sampleInput)
    assert(result == 4) { "Expected 4 but got $result" }
  }

  @Test
  fun `part 2`() {
    val input = object {}.javaClass.getResource("day-2-part-1.txt")?.readText().toString()
    val result = day2_part2(input)
    assert(result == 514) { "Expected 514 but got $result" }
  }
}
