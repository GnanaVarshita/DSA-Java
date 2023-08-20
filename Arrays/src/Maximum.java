public class Maximum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,90,4,8};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int m=arr[0];
        for(int i=0;i<arr.length;i++){
            if(m<arr[i]){
                m= arr[i];
            }

        }
        return m;
    }
}
