import java.lang.reflect.Array;
import java.util.Arrays;
class Arrays1 {
 int[] sortArray(int[] Array){
    for(int i=0;i<10000000;i++){
        Arrays.sort(Array);
    }
    return Array;
}
}

