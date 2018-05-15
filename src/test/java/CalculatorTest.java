import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
  @Test
  public void add() {
    assertEquals(5, Calculator.add(2,3));
  }

  @Test
  public void subtract() {
    assertEquals(1, Calculator.subtract(3,2));
  }

  @Test
  public void multiply() {
    assertEquals(6, Calculator.multiply(2,3));
  }

  @Test
  public void divide() {
    assertEquals(2, Calculator.divide(6,3));
  }
}
