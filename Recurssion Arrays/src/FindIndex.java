import java.util.ArrayList;

public class FindIndex {
    public static void main(String[] args) {

    }
    static ArrayList<Integer> findAllIndex(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex(arr, target,index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
