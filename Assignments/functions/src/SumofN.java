import java.util.Scanner;
public class SumofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(sum(a));
    }

    public static int sum(int n){
        int s= (n*(n+1))/2;
        return s;
    }

}
