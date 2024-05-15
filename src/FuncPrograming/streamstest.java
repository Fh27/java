package FuncPrograming;

import java.util.List;

public class streamstest {
    public static void main(String[] args) {
        List<String> ls=List.of("furqan","hasan","mohd");
        ls.stream().forEach(num-> System.out.println(num));
    }
}
