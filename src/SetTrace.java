import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTrace {
    public static void main(String[] args){
        Set<String> hashSet = new HashSet<>();
        boolean r1 = hashSet.add("Prajwal");
        boolean r2 = hashSet.add("Asha");
        boolean r3 = hashSet.add("Prajwal");

        System.out.println("r1 (Prajwal): " + r1);
        System.out.println("r2 (Asha): " + r2);
        System.out.println("r3 (Prajwal): " + r3);
        System.out.println("HashSet size: " + hashSet.size());

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(40);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(20);

        System.out.println("TreeSet elements: " + treeSet);
    }
}
