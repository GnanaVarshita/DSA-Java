package Singly;

import Singly.LL;

public class Main {
    public static void main(String[] args) {
       LL list = new LL();
       list.insertFirst(7);
       list.insertFirst(2);
        list.insertFirst(9);
        list.insertFirst(8);
        list.insertFirst(14);
         list.insert(100,5);
        list.insertLast(18);
        list.insertFirst(2);
        list.display();
        list.duplicates();
        list.display();

    }
}