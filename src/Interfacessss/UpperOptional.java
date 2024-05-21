package Interfacessss;

import java.util.Optional;

public class UpperOptional {
    public static void main(String[] args) {
        System.out.println(toOptional(null));
        System.out.println("");
        System.out.println(toOptional("furqan"));
    }
    public static Optional<String> toOptional(String s){
        if(s==null || s.isEmpty()){
            return Optional.empty();
        }
        return Optional.of(s.toUpperCase());
    }

}
