import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
    ReverseString str1=new ReverseString();
    @Test
    void reverse() {

        assertEquals("avaj",str1.reverse("java"));
    }
    @Test
    void reversemultiplewords(){
        assertEquals("orb olleh",str1.reverse("hello bro"));
    }
}