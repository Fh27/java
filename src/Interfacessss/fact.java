package Interfacessss;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;
import java.util.stream.IntStream;

public class fact {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();

        IntStream.rangeClosed(2,num).reduce((a,b)->a*b).ifPresent(System.out::println);
    }
}
