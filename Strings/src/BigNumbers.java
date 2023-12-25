import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args) {
        int a= 40;
        int b= 60;

        BigInteger A = BigInteger.valueOf(74839295);

        System.out.println(fact(100));

    }

    static BigInteger fact(int num){
        BigInteger ans = new BigInteger("1");

        for (int i = 2; i <=num; i++) {
            ans=ans.multiply(BigInteger.valueOf(i));
        }

        return ans;
    }

    static void BD(){
        //big decimal -> go to documentation.
    }
}
