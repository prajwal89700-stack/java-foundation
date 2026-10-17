public class WalletCalculator {
    public static void main(String[] args) {
        long newBalance = calculateRemainingBalance(5000L, 1200L);
        System.out.println("New balance: " + newBalance);
        int bonus = calculateBonus(5);
        System.out.println("Bonus earned: " + bonus);
    }

    public static long calculateRemainingBalance(long currentBalance, long withdrawalAmount) {
        long remainingBalance = currentBalance - withdrawalAmount;
        return remainingBalance;
    }

    public static int calculateBonus(int transactions) {
        int calculatedBonus = transactions * 10;
        return calculatedBonus;
    }
}