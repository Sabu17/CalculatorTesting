import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
  
  @Test
  public void addTest() {
    assertEquals(5, CalculatorTest.add(2, 3), 0);
  }
 

@Test
  public void subtractTest() {
    assertEquals(2, CalculatorTest.subtract(5, 3), 0);
  }

  @Test
  public void multiplyTest() {
    assertEquals(12, CalculatorTest.multiply(3, 4), 0);
  }
//Asalblewi
  @Test
  public void divideTest() {
    assertEquals(5, CalculatorTest.divide(10, 2), 0);
  }
  
  public static int subtract(int a, int b) {
    return a - b;
  }
  
  public static int multiply(int a, int b) {
    return a * b;
  }
  
  public static int divide(int a, int b) {
    return a / b;
  }



  public static int add(int a, int b) {
    return a + b;
  }
  }

