import java.util.Scanner;

public class InfosysStock2Scanner {
    public static int stock2(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] stock = new int[n];
        for (int i = 0; i < n; i++) {
            stock[i] = sc.nextInt();
        }
        System.out.println(stock2(stock));
    }
}