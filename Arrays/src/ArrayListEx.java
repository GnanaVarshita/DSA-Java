import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(10);
       // list.add(64);
        //u can add as many as numbers u wish there is no limit
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Enter the element:"+i+" ");
            list.add(in.nextInt());
        }

        System.out.println(list);
    }
}
