public class Main {
    public static void main(String[] args) {
        int[] arr={2,5,-8,-28,4,55,89,90,22};
        int target= 4;
        System.out.println(search(arr,target));
    }
    //searching
    static int search(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                return i;
            }
        }
        return -1;
    }
}