import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       int[][] arr= new int[2][4];
       Scanner in = new Scanner(System.in);

       for(int r=0;r<2;r++){
           for(int c=0;c<arr[r].length;c++){
               arr[r][c]=in.nextInt();
           }
       }

        for(int r=0;r<2;r++){
            for(int c=0;c<arr[r].length;c++){
                System.out.print(arr[r][c]+" ");
            }
            System.out.println(" ");
        }

        for(int r=0;r<2;r++){
            System.out.println(Arrays.toString(arr[r]));
        }
    }
}