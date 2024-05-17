package Collections;

public class eigthynine {


    public static void main(String[] args) {
        System.out.println(conc("furqan","hasan" ,"mohd"));
    }
    public static String conc(String ...stts){
        StringBuilder sb=new StringBuilder();
        for (String stt : stts) {
            sb.append(stt).append(" ");
        }
        return sb.toString();

    }
}
