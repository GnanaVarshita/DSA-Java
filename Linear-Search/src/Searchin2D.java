import java.util.Arrays;

public class Searchin2D {
    public static void main(String[] args) {
        int[][] arr={
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target =18;

        int[] ans =search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(min(arr));
    }
     static int[] search(int[][] arr,int target){
        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[r].length;c++){
                if(arr[r][c]==target){
                    return new int[]{r,c};
                }
            }
        }
        return new int[]{-1,-1};
     }

     static int min(int[][] arr){
        int m=arr[0][0];
        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[r].length;c++){
                if(arr[r][c]<m){
                    m=arr[r][c];
                }
            }
        }

        return m;
     }

}
//similarly find maximum element in array