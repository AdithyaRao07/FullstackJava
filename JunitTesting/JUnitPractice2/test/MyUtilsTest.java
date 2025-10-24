import org.junit.Test;
import static org.junit.Assert.*;

public class MyUtilsTest {

    @Test
    public void reverse() {
       MyUtils String1=new MyUtils();
       String result=String1.reverse("python");
       assertEquals("nohtyp",result);
    }
}
