public class Main {
    public static void main(String[] args) {

        int[] arr={-12,-10,-5,-4,0,2,3,4,5,6,7};
        int target=-12;

        System.out.println(binarySearch(arr,target));

    }

    static int binarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;

            } else if (target<arr[mid]) {
                end=mid-1;

            }
            else if(arr[mid]==target){
                return mid;
            }
        }
        return -1;
    }
}