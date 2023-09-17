package introduction;

public class MAin {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        int[] rno=new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        //data of 5students :{roll,name,marks}

       // Student[] students = new Student[5];

        Student Varshita = new Student(14,"Varshita",8.5f);
        System.out.println(Varshita.name+" "+Varshita.rno+" "+Varshita.marks);

    }

    //create a class

}
class Student{
    int rno;
    String name;
    float marks;

    Student(int rno,String name,float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }

    Student(){
        this.rno=13;
        this.name="rahul";
        this.marks=8.9f;
    }
}
