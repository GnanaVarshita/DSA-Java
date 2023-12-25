import java.util.*;
import java.lang.Math;
public class Segmented
{
    public static void main(String[] args) {
        segmented(5,25);
    }

    public static void segmented(int l,int h){
        int n= h-l+1;
        boolean[] primes=new boolean[n];

	    /*for(int i=0;i<n;i++){
	        primes[i]=true;
	    }
	    */

        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=l+i;
        }

        for(int i=0;i<n;i++){
            primes[i]=isPrime(nums[i]);
        }

        for(int i=0;i<n;i++){
            if(primes[i]==true){
                System.out.println(i+l);
            }
        }
    }
}