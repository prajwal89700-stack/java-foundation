import java.util.ArrayList;
import java.util.List;

class Box<T>{
    private T item;
    public void set(T item) {
        this.item = item;
    }
    public T get() {
        return this.item;
    }
}

public class GenericsTrace {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("Apex-Wallet");

        Box<Long> balanceBox = new Box<>();
        balanceBox.set(50000L);

        System.out.println("String Box: " + stringBox.get());
        System.out.println("Balance Box: " + balanceBox.get());

        System.out.println("Custom generic classes equal? " + (stringBox.getClass() == balanceBox.getClass()));

        List<String> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        System.out.println("ArrayList classes equal? " + (list1.getClass() == list2.getClass()));
    }
    }
