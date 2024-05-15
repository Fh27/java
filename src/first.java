import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class first {

    public static void main(String[] args) {
        Map<String,String> mpp=new HashMap<>();
        mpp.put("india","delhi");
        mpp.put("china","beijing");
        Scanner scn=new Scanner(System.in);
        String input=scn.next();
        if(mpp.containsKey(input)){
            System.out.println("the country "+input+"has " +mpp.get(input));
        }else{
            System.out.println("not found");
        }
        System.out.println("hello");
    }
}
