import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.*;

class Arrays1Test {

@Test
    void TestArrays(){
    int[] Expected={1,2,3,4};
    int[] Actual={1,2,4,3};
    Arrays.sort(Actual);  //sorted array will be {1,2,3,4} Test case will pass
    //To pass this test case both arrays should have same elements in same order and same no.of elements
    assertArrayEquals(Expected,Actual);
}

    @Test
    void sortArray() {
    Arrays1 arr=new Arrays1();
   Arrays1 arr2=new Arrays1();
        int [] unsorted={1,8,3,5,4};
        assertTimeout(Duration.ofMillis(10),()->arr2.sortArray(unsorted));
    }
}