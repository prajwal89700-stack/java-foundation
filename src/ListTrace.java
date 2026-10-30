import java.util.ArrayList;
import java.util.List;

public class ListTrace {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("Prajwal");
        list.add("Asha");
        list.add("Ravi");

        System.out.println("Size 1: " + list.size());
        System.out.println("Element at 1: " + list.get(1));

        list.remove(1);
        System.out.println("Size 2: " + list.size());
        System.out.println("Element at 1 after remove: " + list.get(1));
    }
}
