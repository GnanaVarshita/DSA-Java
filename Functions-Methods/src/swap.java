public class swap {
    public static void main(String[] args) {
        int a= 10;
        int b=20;
        swap(a,b);
        System.out.println("Now look at the original a and b values");
        System.out.println(a+" "+b);
    }

    static void swap(int a ,int b){
        int temp=b;
        b=a;
        a= temp;
        System.out.println(a+" "+b);

        //this change will only be valid in this function scope only.

    }
}
