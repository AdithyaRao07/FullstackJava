import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
 Course course=new javacourse();
    Course course2=new pythoncourse();
 String str="Raj";
 // Test Case pass only if the condition returns true
    @Test
    void purchasedcourse() {
        assertTrue(course.purchasedcourse());
    }
    @Test
    void purchasedcoures(){
        assertTrue(course2.purchasedcourse());
    }

    // Test case pass only if the condition returns false
    @Test
    void purchasedcourse2(){
        assertFalse(str.equals("raj"));
    }
}