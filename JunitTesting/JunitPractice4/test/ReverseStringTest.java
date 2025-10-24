import static org.junit.jupiter.api.Assertions.*;

 class ReverseStringTest {

    @org.junit.jupiter.api.Test
    void reverse() {
        ReverseString String1=new ReverseString();
        assertEquals("avaj",String1.reverse("java"));
    }
}