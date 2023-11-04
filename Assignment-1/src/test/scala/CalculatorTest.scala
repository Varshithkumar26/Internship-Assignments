import org.scalatest.flatspec.AnyFlatSpec

class CalculatorTest extends AnyFlatSpec {
  "add" should "return the sum of two integers" in {
    val calculatorObj = new Calculator
    assert(calculatorObj.add(2,3) === 5)
  }
  "subtract" should "return the difference of two integers" in {
    val calculatorObj = new Calculator
    assert(calculatorObj.subtract(5, 3) === 2)
  }
  "multiply" should "return the multiplication of two integers" in {
    val calculatorObj = new Calculator
    assert(calculatorObj.multiply(2, 3) === 6)
  }
  "divide" should "return the division of two integers" in {
    val calculatorObj = new Calculator
    assert(calculatorObj.divide(6, 3).get === 2)
    assert(calculatorObj.divide(6, 0) === None)
  }
}
