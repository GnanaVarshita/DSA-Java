import java.util.Scanner;

public class Main {

    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number 1 :");
        int num1=in.nextInt();

        System.out.println("Enter Number 2 :");
        int num2=in.nextInt();

        int add=num1+num2;
      //  System.out.println("The sum is :"+sum);
        return add;
    }
    public static void main(String[] args) {
       int ans =sum();
        System.out.println(ans);

    }
}