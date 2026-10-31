import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class CompareLists {
       public static void main(String[] args){
           List<String> arrayList = new ArrayList<>();
           List<String> linkedList = new LinkedList<>();

           arrayList.add("Order1");
           arrayList.add("Order2");

           linkedList.add("Order1");
           linkedList.add("Order2");

           arrayList.add(0, "VIP_Order");
           linkedList.add(0, "VIP_Order");

           System.out.println("ArrayList index 0: " + arrayList.get(0));
           System.out.println("ArrayList index 1: " + arrayList.get(1));
           System.out.println("LinkedList index 0: " + linkedList.get(0));
           System.out.println("LinkedList index 1: " + linkedList.get(1));
       }
}
