import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        int[] arr= new int[5];
        arr[0]=23;
        arr[1]=56;
        Scanner in = new Scanner(System.in);

        System.out.println(arr[0]);

        //input using for loop
        for(int i=2;i<arr.length;i++){
            arr[i]=in.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
