package gcukakao.jenkins.calculator; 
import org.junit.Test;

import gcukakao.jenkins.calculator.Calculator;

import static org.junit.Assert.assertEquals; 
 
public class CalculatorTest { 
     private Calculator calculator = new Calculator(); 
 
     @Test 
     public void testMul() { 
          assertEquals(5, calculator.multiply(2, 3)); 
     } 
} 
