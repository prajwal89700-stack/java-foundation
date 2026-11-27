import java.util.Scanner;

public class InfosysBirthdayGiftScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(giftScanner(n, k));
    }

    public static int giftScanner(int n, int k) {
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            dp[i] = 1;
        }
        for (int len = 2; len <= k; len++) {
            int[] next = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                for (int m = i; m <= n; m += i) {
                    next[i] = (next[i] + dp[m]) % 10000;
                }
            }
            dp = next;
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans = (ans + dp[i]) % 10000;
        }
        return ans;
    }
}
