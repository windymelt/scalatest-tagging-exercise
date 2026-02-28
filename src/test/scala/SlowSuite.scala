import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.tags.Slow

@Slow class SlowSuite extends AnyFunSuite {
  test("very slow test") {
    assert(1 + 1 == 2)
  }
  test("another very slow test") {
    assert(2 + 2 == 4)
  }
  test("heavy test") {
    assert(3 + 3 == 6)
  }
}
