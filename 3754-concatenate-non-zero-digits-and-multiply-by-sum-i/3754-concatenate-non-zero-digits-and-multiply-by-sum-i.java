class Solution {
    public long sumAndMultiply(int n) {

        long reverse = 0;
        long sum = 0;

        // Build reversed number without zeros and calculate sum
        while (n > 0) {
            int digit = n % 10;

            if (digit != 0) {
                reverse = reverse * 10 + digit;
                sum += digit;
            }

            n /= 10;
        }

        // Reverse the number to get the correct order
        long x = 0;
        while (reverse > 0) {
            x = x * 10 + (reverse % 10);
            reverse /= 10;
        }

        return x * sum;
    }
}