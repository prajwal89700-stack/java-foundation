import java.util.List;

public class StreamTrace {
    public static void main(String[] args) {
        List<Long> transactions = List.of(25000L, 120000L, 45000L, 300000L, 15000L, 85000L);
        List<String> approvedReceipts = transactions.stream()
                .filter(amount -> amount >= 50000L)
                .map(amount -> "APPROVED: Rs " + (amount / 100))
                .toList();
        System.out.println("Approved Receipts: " + approvedReceipts);

        long highValueCount = transactions.stream()
                .filter(amount -> amount >= 100000L)
                .count();
        System.out.println("High-value count: " + highValueCount);
    }
}
