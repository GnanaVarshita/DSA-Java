import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in) ;
        System.out.println("Enter the value:");
        int num= in.nextInt();
        boolean ans = isPrime(num);
        System.out.println(ans);

    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%n==0){
                return false;
            }
            c++;
        }
        return c*c>n;
    }
}
