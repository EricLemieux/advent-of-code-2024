import com.lemieuxdev.adventofcode2024.day1.day1_part1
import com.lemieuxdev.adventofcode2024.day1.day1_part2
import kotlin.test.Test
import kotlin.test.fail

class Day1KtTest {
  val sampleInput =
      """
            3   4
            4   3
            2   5
            1   3
            3   9
            3   3
        """
          .trimIndent()

  @Test
  fun `part 1 sample`() {
    val result = day1_part1(sampleInput)
    assert(result == 11) { "Expected 11 but got $result" }
  }

  @Test
  fun `part 1`() {
    val input = object {}.javaClass.getResource("day-1-part-1.txt")?.readText().toString()
    val result = day1_part1(input)
    assert(result == 1197984) { "Expected 1197984 but got $result" }
  }

  @Test
  fun `part 2 sample`() {
    val result = day1_part2(sampleInput)
    assert(result == 11) { "Expected 11 but got $result" }
  }

  @Test
  fun `part 2`() {
    fail()
  }
}
