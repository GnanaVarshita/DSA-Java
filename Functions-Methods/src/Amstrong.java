import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in) ;
        System.out.println("Enter the value:");
        int num= in.nextInt();
        boolean ans = isArmstrong(num);
        System.out.println(ans);

        for(int i =100;i<1000;i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }

    static boolean isArmstrong(int a){
        int original =a;
        int sum=0;

        while(a>0){
            int rem =a%10;
            sum = sum +(rem*rem*rem);
            a=a/10;

        }

        if(sum==original){
            return true;
        }

        return false;

    }
}
