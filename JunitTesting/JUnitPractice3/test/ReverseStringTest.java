import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test
    public void reverse() {
        ReverseString String1=new ReverseString();
        assertEquals("tinuJ",String1.reverse("Junit"));
    }
}