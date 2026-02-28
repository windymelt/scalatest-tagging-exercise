import org.scalatest.funsuite.AnyFunSuite
import dev.capslock.scalatesttaggingexercise.tagobjects.Heavy
import org.scalatest.tagobjects.Slow
import org.scalatest.tagobjects.CPU

class MySuite extends AnyFunSuite {
  test("example test", CPU) {
    assert(1 + 1 == 2)
  }
  test("another example test", Slow) {
    assert(2 + 2 == 4)
  }
  test("heavy test", Heavy, Slow) {
    assert(3 + 3 == 6)
  }
}
