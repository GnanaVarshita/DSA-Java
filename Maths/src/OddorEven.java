import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        System.out.println(isOdd(n));
        //the last number is called least significant bit
    }

    // All the bit wise operator follows associative law
    static boolean isOdd(int n){
        return (n&1)==1;
    }
}