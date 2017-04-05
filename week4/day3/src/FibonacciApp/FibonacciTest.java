package FibonacciApp;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
  Fibonacci fibonacci = new Fibonacci();

  @Test
  public void fibonacciRandom() throws Exception {
  int n = 8;
  assertEquals(21, fibonacci.fibonacci(n));
  }

  @Test
  public void fibonacciZero() throws Exception {
  int n = 0;
    assertEquals(0, fibonacci.fibonacci(n));
  }

  @Test
  public void fibonacciMinus() throws Exception {
  int n = -3;
    assertEquals(-1, fibonacci.fibonacci(n));
  }
}