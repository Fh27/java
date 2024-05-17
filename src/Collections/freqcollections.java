package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class freqcollections {
    public static void main(String[] args) {
        List<Integer> ls= Arrays.asList(1,23,34,445,544);
        System.out.println(Collections.frequency(ls,1));

        System.out.println(Collections.frequency(ls,7));
    }
}
