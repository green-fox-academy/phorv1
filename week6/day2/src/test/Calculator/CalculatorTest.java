package Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

  @Test
  void NothingToAddTest() {
    assertEquals(Double.valueOf(0), Calculator.add());
  }

  @Test
  void NothingToSubtractTest() {
    assertEquals(null, Calculator.subtract());
  }

  @Test
  void NothingToMultiplyTest() {
    assertEquals(null, Calculator.multiply());
  }

  @Test
  void NothingToDivideTest() {
    assertEquals(null, Calculator.divide());
  }
}
