import java.util.HashMap;
import java.util.Map;

public class MapTrace {
    public static void main(String[] args){
        Map<String, Long> wallet = new HashMap<>();

        wallet.put("Prajwal", 50000L);
        wallet.put("Asha", 200000L);
        wallet.put("Ravi",10000L);

        System.out.println("Prajwal balance: " + wallet.get("Prajwal"));
        System.out.println("Contains Asha? " + wallet.containsKey("Asha"));

        Long oldBalance = wallet.put("Prajwal", 65000L);

        System.out.println("Old balance returned: " + oldBalance);
        System.out.println("New balance: " + wallet.get("Prajwal"));
        System.out.println("Total accounts (size): "+ wallet.size());
    }
}
