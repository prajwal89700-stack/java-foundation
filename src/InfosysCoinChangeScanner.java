import java.util.Scanner;
import java.util.Arrays;

public class InfosysCoinChangeScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int[] coins = new int[k];
        for(int i = 0; i < coins.length; i++){
            coins[i] = sc.nextInt();
        }
        int amount = sc.nextInt();
        System.out.println(CoinChange(coins, amount));
    }
    public static int CoinChange(int[] coins, int amount){
            int[] dp = new int[amount + 1];
            Arrays.fill(dp, amount + 1);
            dp[0] = 0;
            for(int a = 1; a <= amount; a++) {
                for(int coin : coins) {
                    if(a - coin >= 0) {
                        dp[a] = Math.min(dp[a], 1 + dp[a - coin]);
                    }
                }
            }
            return dp[amount] > amount ? -1 : dp[amount];
    }
}
