import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr1 = {4,7,0,2,67,8,9,12,65};
        arrayreverse(arr1);
    }

    static void arrayreverse(int [] arr){
        int s=0;
        int e= arr.length-1;
        while(s<=e){
            swap(s,e);
            s++;
            e--;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int a, int b){
        int temp = a;
        a= b;
        b= temp;
    }
}
