import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         int[] arr={4,5,2,3,1};
         cycle(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cycle(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;//correct index
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }

        }
    }

    static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first]= arr[last];
        arr[last]= temp;
    }
}