package FuncPrograming;

import java.util.List;

public class oddlist {
    public static void main(String[] args) {
        List<Integer> ls=List.of(1,2,3,4,5,6,7,8,9);
        ls.stream().filter(num->num%2==1).forEach(s-> System.out.println(s));
    }
}
