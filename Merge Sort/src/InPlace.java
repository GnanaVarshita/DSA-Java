public class InPlace {
    public static void main(String[] args) {

    }
    static int[] Inplace(int[]arr, int s, int e){
        if(e-s==1){
            return arr;
        }
        int mid=(s+e)/2;

        int[] left = Inplace(arr, s,mid);
        int[] right=Inplace(arr,mid,e);

        return mergeInplace(left,right);
    }
    static int[] mergeInplace(int[] arr, int s,int m, int e){
        int[] mix= new int[e-s];
        int i=s;
        int j=m;
        int k =0;

        while(i<m&&j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<m){
            mix[k]= arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]= arr[j];
            j++;
            k++;
        }
        for(int l=0;l<mix.length;l++){
           arr[s+l]=mix[l];
        }
    }
}
