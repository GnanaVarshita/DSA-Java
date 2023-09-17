//euler's phi:
import java.util.*;
public class Eulersphi{
    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    public static int phi(int n){
        int res = 1;
        for(int i=2;i<n;i++){
            if(gcd(i,n)==1){
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args)
    {

        for(int i=1;i<10;i++){
            System.out.println(phi(i));
        }

    }
}
