public class Main{
    public int isPrime(int num){

        if (num <= 1)
            return 0;

        // Check from 2 to n-1
        for (int i = 2; i < num; i++){
            if (num % i == 0)
            {
                return 0;
            }
        }
        return num;
    }
    public void SegSieve(int l,int h){

        for(int i=l;i<h;i++){
            if(isPrime(i)==0){
                continue;
            }
            else{
                System.out.print(isPrime(i)+" ");
            }
        }
    }
    public static void main(String[] args)
    {

        Main obj1 = new Main();
        obj1.SegSieve(0,10);
    }
}