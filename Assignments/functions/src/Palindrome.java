//Check if a number is Palindrome
import java.util.*;

public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(isPalindrome(a));
    }
    public static boolean isPalindrome(int num){

        int reverse=0;
        int temp=num;
        while(temp!=0){
            int rem= temp%10;
            reverse= (reverse)*10+rem;
            temp=temp/10;

        }
        if(reverse==num){
            return true;
        }

        return false;
    }
}