import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Scanner sc = new Scanner(System.in);

        //inputstream reader ->byte to character
        //streams have to be closed once started
        try(InputStreamReader isr = new InputStreamReader(System.in)){
            System.out.println("Enter some letters");
            int letters= isr.read();
            while(isr.ready()){
                System.out.println((char)letters);
                letters = isr.read();
            }
            isr.close();
            System.out.println();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

        try(FileReader fr= new FileReader("note.txt")){
            int letter = fr.read();
            while(fr.ready()){
                System.out.println((char)letter);
                letter= fr.read();
            }
            System.out.println();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
//Taking data in byte and converting them into chars
//Taking from txt input