import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
//Generally we use this TestInstance annotation to avoid creating instance for each method seperately and allow to create one instance of class and if we create a class Instance we do not nedd to mention static for @BeforeAll and @AfterAll annotations
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class shapesTest {
    //Constructor is created to check how many times instance is created
    shapesTest(){
        System.out.println("Instance is created");
    }
shapes box;
@BeforeAll //can be used to connect db and the method should always be static unless u create a class TestInstance
void learingBeforeAll(){
    System.out.println("before all method");
}
    @BeforeEach //runs before running each test method helps to avoid duplicate creation of objects
    void repeatBeforeTest(){
    box=new shapes();
    System.out.println("before test");
}
    @Test
    void testareaofsquare() {
        assertEquals(49, box.areaofsquare(7),"failed test case");
    }
    //test case using supplier interface and lambda expression
    @Test
    void testareaofsquare_supplier() {
        // the string message is only evaluated when the test case fails unlike the above test cse method this method is most efficient

        assertEquals(49, box.areaofsquare(7),()->"failed test case");
    }
    //test case passes if the actual output doesn't match the expected output
    @Test
    void testAreaOfSquare2(){
        assertNotEquals(30,box.areaofsquare(6),"Test case failed");
    }
    @Test
    void testAreaofSquare_supplier(){
        assertNotEquals(30,box.areaofsquare(6),()->"Test case failed");
    }
    @AfterEach //Runs after execution of each test method usually used to close something to manage resources after completion of method execution
    void repeatAfterEach(){
        System.out.println("After test");
    }
    @AfterAll //used to close common resource and should be static unless u create a class TestInstance and this is called at last
     void learningAfterAll(){
        System.out.println("After all is Executed");
    }
}