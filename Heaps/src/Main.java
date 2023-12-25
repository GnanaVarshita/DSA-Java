public class Main {
    public static void main(String[] args) throws Exception{
      Heap<Integer> heap= new Heap<>();
      heap.insert(34);
        heap.insert(6);
        heap.insert(79);
        heap.insert(78);

        System.out.println(heap.remove());
    }
}