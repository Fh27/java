package Streams;

import java.util.List;

public class squarereduce {
    public static void main(String[] args) {
        List<String> ls=List.of("1","2","3","4","5","6");
        ls.stream()
                .map(Integer::parseInt)
                .map(num->Math.pow(num,2))
                .reduce(Double::sum)
                .ifPresent(System.out::println);
    }
}
