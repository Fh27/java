package FuncPrograming;

import java.util.List;

public class filteringlist {
    public static void main(String[] args) {
        List<String> ls=List.of("Md","Furqan","Hasan");
       String res= ls.stream()
                .filter(num->num.length()>3)
                .reduce(" ",(a,b)->a+" "+b);
        System.out.println(res);
    }
}
