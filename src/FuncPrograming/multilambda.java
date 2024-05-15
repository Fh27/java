package FuncPrograming;

import java.util.function.BinaryOperator;

public class multilambda {
    public static void main(String[] args) {
        BinaryOperator<Integer> multi= (a, b)-> a*b;
        int res=multi.apply(3,4);
        System.out.println(res);
    }
}
