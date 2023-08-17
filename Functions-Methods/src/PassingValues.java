import java.util.Scanner;

public class PassingValues {
    public static void main(String[] args) {
        int ans = sum(20,50);
        System.out.println(ans);

        String hello= greet("Gnana Varshita");
        System.out.println(hello);
    }
    static int sum(int num1,int num2){

        int add=num1+num2;
        //  System.out.println("The sum is :"+sum);
        return add;}
    static String greet(String name){

        return name;
    }
}
