import java.util.Scanner;
public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter min value :");
        int a=sc.nextInt();
        System.out.println("Enter max value:");
        int b = sc.nextInt();
        for(int i=a;i<=b;i++){
            isPrime(i);
        }
    }

    public static void isPrime(int p){
        int counter=0;
        for(int i=2;i<p;i++){
            if(p%i==0){
                counter++;
               break;
            }

        }

        if(counter==0){
            System.out.println(p+" is Prime");
        }

    }
}
