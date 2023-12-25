import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static void radixSort(int[] arr){
        int max= Arrays.stream(arr).max().getAsInt();
        for(int exp=1;max/exp>0;exp*=10){
            countSort(arr,exp);
        }
    }

    private static void countSort(int[] arr,int exp){
        int n= arr.length;
        int[] output= new int[n];
        int[] count = new int[10];
        Arrays.fill(count,0);
        for(int i=0;i<n;i++){
            count[(arr[i]/exp)%10]++;
        }
    }
}