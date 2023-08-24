public class pakkabinary {
    public static void main(String[] args) {

        int[] arr1={-12,-10,-5,-4,0,2,3,4,5,6,7};
        int target=4;

        System.out.println(binary(arr1,target));

        int[] arr2={44,40,27,17,15,8,2,0,-10,-14,-24};
        int t2=-10;
        System.out.println(binary(arr2,t2));

    }
    static int binary(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        if(arr[s]<arr[e]){
            while(s<=e){
                int mid=s+(e-s)/2;
                if(target>arr[mid]){
                    s=mid+1;

                } else if (target<arr[mid]) {
                    e=mid-1;

                }
                else if(arr[mid]==target){
                    return mid;
                }
            }
        }
        else{
            while(s<=e){
                int mid=s+(e-s)/2;
                if(target>arr[mid]){
                    e=mid-1;
                }

                else if(target<arr[mid]){
                    s=mid+1;
                }

                else if(arr[mid]==target){
                    return mid;
                }
            }
        }

        return -1;
    }
}
