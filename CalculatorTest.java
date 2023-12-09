import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
  
  @Test
  public void addTest() {
    assertEquals(5, Calculator.sum(2, 3), 0);
  }
 

@Test
  public void subtractTest() {
    assertEquals(2, Calculator.sub(5, 3), 0);
  }

  @Test
  public void multiplyTest() {
    assertEquals(12, Calculator.mult(3, 4), 0);
  }

  @Test
  public void divideTest() {
    assertEquals(5, Calculator.div(10, 2), 0);
  }
  }

