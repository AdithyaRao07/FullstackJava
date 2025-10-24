import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class shapesTest {
    shapes box=new shapes();
    @Test
    public  void squareareatest(){
        assertEquals(16,box.areaOfSquare(4));
    }
    @Test
    public void perimeterOfSquareTest(){
        assertEquals(20,box.perimeterOfSquare(5));
        assertTimeout(Duration.ofMillis(10),()->box.areaOfSquare(5));
    }
}