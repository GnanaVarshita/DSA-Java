import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr={1,2,23,9,10};
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int num1,int num2){
        int temp = arr[num1];
        arr[num1]= arr[num2];
        arr[num2]= temp;
    }
}
