package prvenac;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CalculatorTest {
  
  @Test
  public void addTest() {
    assertTrue(5, Calculator.sum(2, 3), 0);
  }
 

@Test
  public void subtractTest() {
    assertTrue(2, Calculator.sub(5, 3), 0);
  }

  @Test
  public void multiplyTest() {
    assertTrue(12, Calculator.mult(3, 4), 0);
  }

  @Test
  public void divideTest() {
    assertTrue(5, Calculator.div(10, 2), 0);
  }
}

