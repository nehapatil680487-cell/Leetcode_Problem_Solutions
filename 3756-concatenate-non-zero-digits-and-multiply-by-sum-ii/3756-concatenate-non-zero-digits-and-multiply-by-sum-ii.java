class Solution {

    static final int MOD = 1_000_000_007;

    public int[] sumAndMultiply(String s, int[][] queries) {

        int n = s.length();

        // prefix sum of non-zero digits
        int[] prefixSum = new int[n + 1];

        // prefix count of non-zero digits
        int[] prefixCount = new int[n + 1];

        // prefix concatenated number (ignoring zeros)
        long[] prefixNumber = new long[n + 1];

        // powers of 10
        long[] pow10 = new long[n + 1];
        pow10[0] = 1;

        for (int i = 1; i <= n; i++) {
            pow10[i] = (pow10[i - 1] * 10) % MOD;
        }

        // Preprocessing
        for (int i = 0; i < n; i++) {

            int digit = s.charAt(i) - '0';

            prefixSum[i + 1] = prefixSum[i];
            prefixCount[i + 1] = prefixCount[i];
            prefixNumber[i + 1] = prefixNumber[i];

            if (digit != 0) {
                prefixSum[i + 1] += digit;
                prefixCount[i + 1]++;

                prefixNumber[i + 1] =
                        (prefixNumber[i] * 10 + digit) % MOD;
            }
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int l = queries[i][0];
            int r = queries[i][1];

            // Sum of non-zero digits
            int sum = prefixSum[r + 1] - prefixSum[l];

            // Number of non-zero digits
            int cnt = prefixCount[r + 1] - prefixCount[l];

            if (cnt == 0) {
                ans[i] = 0;
                continue;
            }

            long left = (prefixNumber[l] * pow10[cnt]) % MOD;

            long x = (prefixNumber[r + 1] - left + MOD) % MOD;

            ans[i] = (int) ((x * sum) % MOD);
        }

        return ans;
    }
}