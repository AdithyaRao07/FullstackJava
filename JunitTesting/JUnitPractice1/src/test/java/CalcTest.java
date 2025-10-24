import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {
    @Test
    public void testDivide(){
        Calc  num1=new Calc();
        int result=num1.divide(20,4);
        assertEquals(5,result);

    }
    @Test
    public void testMultiply(){
        Calc num1=new Calc();
        int result2=num1.multiply(10,5);
        assertEquals(50,result2);

    }
}