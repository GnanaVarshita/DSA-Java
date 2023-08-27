public class SortedMatrix {
    public static void main(String[] args) {

    }

    static int[] bsearch(int[][] matrix,int row,int cStart,int cEnd,int target){
        while(cStart<=cEnd){
            int mid = cStart+(cEnd-cStart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }

            if(matrix[row][mid]<target){
                  cStart=mid+1;
            }else{
                cEnd = mid-1;
            }
        }

        return new int[]{-1,-1};
    }

    static int[] search(int[][] matrix,int target){
        int rows=matrix.length;
        int cols = matrix[0].length;
         if(rows==1){
             return bsearch(matrix,0,0,cols-1,target);
         }
         int rStart=0;
         int rEnd=rows-1;
         int cMid=cols/2;


         //run the loop till two rows are remaining
        while(rStart<(rEnd-1)){
            int mid=rStart+(rEnd-rStart)/2;
            if(matrix[mid][cMid]==target){
                return new int[] {mid,cMid};
            }
            if(matrix[mid][cMid]<target){
                rStart= mid;
            }

            else{
                rEnd=mid;
            }

        }
        //Now we have two rows
        //check whether thetarget is in the col of 2 rwos

        if(matrix[rStart][cMid]==target){
            return new int[] {rStart+1,cMid};
        }

        
    }

}
