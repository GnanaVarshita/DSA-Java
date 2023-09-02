public class digitsum {
    public static void main(String[] args) {
        System.out.println(prod(1325));
    }
    static int sum(int n){
        int rem = n%10;
        if(rem==0){
            return 0;
        }

        return rem+sum(n/10);
    }

    static int prod(int n){
        int rem =n%10;
        if(rem ==1){
            return 1;
        }
        return rem*prod(n/10);
    }
}
