import java.util.ArrayList;
//sub set method
public class SubSeq {
    public static void main(String[] args) {
    subseq("","abc");
    }
    static void subseq(String p,String up){
        //string processed and string unprocessed.
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }

    static ArrayList<String> subseq2(String p, String up){
        //string processed and string unprocessed.
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
       ArrayList<String> left= subseq2(p+ch,up.substring(1));
        ArrayList<String> right=subseq2(p,up.substring(1));

        left.addAll(right);
        return left;
    }
}

//Do the subseq with ascii values displaying
