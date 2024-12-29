import com.lemieuxdev.adventofcode2024.day1.day3_part1
import com.lemieuxdev.adventofcode2024.day1.day3_part2
import kotlin.test.Test

class Day3KtTest {
  @Test
  fun `part 1 sample`() {
    val result =
        day3_part1("xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))")
    assert(result == 161) { "Expected 161 but got $result" }
  }

  @Test
  fun `part 1`() {
    val input = object {}.javaClass.getResource("day-3-part-1.txt")?.readText().toString()
    val result = day3_part1(input)
    assert(result == 187194524) { "Expected 187194524 but got $result" }
  }

  @Test
  fun `part 2 sample`() {
    val result =
        day3_part2("xmul(2,4)&mul[3,7]!^don't()_mul(5,5)+mul(32,64](mul(11,8)undo()?mul(8,5))")
    assert(result == 48) { "Expected 48 but got $result" }
  }

  @Test
  fun `part 2`() {
    val input = object {}.javaClass.getResource("day-3-part-1.txt")?.readText().toString()
    val result = day3_part2(input)
    assert(result == 127092535) { "Expected 127092535 but got $result" }
  }
}
