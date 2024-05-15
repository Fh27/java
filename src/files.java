import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class files {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String filename= sc.next();
        try (FileReader reader=new FileReader(filename)){
            int read;
            while((read=reader.read())!=-1){
                System.out.print((char)read);
            }
        }catch(FileNotFoundException ex){
            System.out.printf("file not found %s",filename);
        }

        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
