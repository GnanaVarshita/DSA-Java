import java.util.Scanner;
public class Pythogorous {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println("Enter c:");
        int c = sc.nextInt();

        System.out.println(pythogorous(a,b,c));
    }

    public static boolean pythogorous(int a,int b,int c){
        if((a*a)+(b*b)==c*c){
            return true;
        }
        return false;
    }
}
