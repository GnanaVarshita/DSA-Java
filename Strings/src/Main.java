public class Main {
    public static void main(String[] args) {
        //constructor 1
        StringBuffer sb= new StringBuffer();
        sb.append("Hello World");

        //constructor 2
        StringBuffer sb2=new StringBuffer("Gnana Varshita");

        //constructor 3
        StringBuffer sb3= new StringBuffer(20);

        String str= sb.toString();
        System.out.println(str);


        //what is the difference between string and string buffer.

        sb.reverse();
        System.out.println(sb);

    }
}