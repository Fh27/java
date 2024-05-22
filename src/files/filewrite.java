package files;

import java.io.FileWriter;
import java.io.IOException;

public class filewrite {
    public static void main(String[] args) {
        String filename="newfile.txt";
        try(FileWriter writer=new FileWriter(filename)){
                writer.write("this is my new file\n");
            for (int i = 0; i < 100; i++) {
                writer.write("*\n");

            }
                writer.flush();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

}
