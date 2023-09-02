public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(printnum(5));
    }

    static int printnum(int n){
        if(n>0){

            printnum(n-1);
            System.out.println(n);
        }
        return 0;
    }
}