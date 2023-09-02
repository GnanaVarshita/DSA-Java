public class uniqueNum {
    //Find the number that is repeated
    // do it contant time and one single pass O(n) Complexity
    //XOR operation
    /*
    *Any number XOR with that number is 0
    * ANy num XOR with 0 is that number */
    // So XOR the array with itself
    // ->Space Complexity is constant

    public static void main(String[] args) {
        int[] arr={2,3,4,5,2,3,4};
        System.out.println(ans(arr));
    }
    static int ans(int[] arr){
        int unique=0;
        for(int n:arr){
            unique^=n;
        }
        return unique;
    }
}
