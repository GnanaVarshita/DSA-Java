public class Minimum {
    public static void main(String[] args) {
        int[] arr={2,89,0,4,76,23,76,1000};
        System.out.println(mini(arr));
    }
    static int mini(int[] arr){
        int min =arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
