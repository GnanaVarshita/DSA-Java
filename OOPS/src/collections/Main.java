package collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(55);
        list.add(66);
        System.out.println(list);

        List<Integer> vector = new Vector<>();
        vector.add(45);
        vector.add(67);
        vector.add(89);
        vector.add(23);


    }
}
