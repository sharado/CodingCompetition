import java.util.Scanner;

public class ReconstructingArrays {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        String S = scanner.next();

        int[] dp = new int[N + 1];
        dp[0] = 1;

        for (int i = 1; i <= N; i++) {
            int num = 0;
            for (int j = Math.max(i - 9, 0); j < i; j++) {
                num = num * 10 + (S.charAt(j) - '0');
                if (num >= 1 && num <= K) {
                    dp[i] = (dp[i] + dp[j]) % 1000000007;
                }
            }
        }

        System.out.println(dp[N]);
    }
}
