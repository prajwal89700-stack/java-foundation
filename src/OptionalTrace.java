import java.util. HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalTrace {
    public static void main(String[] args){
        Map<String, Long> walletBalances = new HashMap<>();
        walletBalances.put("Prajwal", 50000L);
        long prajwalBalance = Optional.ofNullable(walletBalances.get("Prajwal")).orElse(0L);
        System.out.println("Prajwal balance: " + prajwalBalance);
        long unknowBalance = Optional.ofNullable(walletBalances.get("UnknowUser")).orElse(0L);
        System.out.println("UnknowUsr balance (fallback): " + unknowBalance);

        try{
            long verifiedBalance = Optional.ofNullable(walletBalances.get("UnknowUser"))
                    .orElseThrow(() -> new IllegalArgumentException("Wallet account not found for UnknowUser"));
        }catch(IllegalArgumentException ex){
            System.out.println("Caught expected exception: " + ex.getMessage());
        }
    }
}
