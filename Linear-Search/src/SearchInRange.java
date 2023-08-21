public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={2,5,-8,-28,4,55,89,90,22};
        int target= 4;
        int start=3;
        int end=7;
        System.out.println(search(arr,target,start,end));
    }
    //searching
    static int search(int[] arr,int target,int start,int end){

        if(arr.length==0){
            return -1;
        }

        for(int i=start;i<end;i++){
            if(target==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
