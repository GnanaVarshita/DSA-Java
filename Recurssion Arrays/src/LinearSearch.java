public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,3,5,18,9,10};
        System.out.println(Search(arr,0,18));
    }
    static int Search(int[] arr,int i, int target){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }

        return Search(arr,i+1,target);
    }
}
