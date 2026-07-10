class Solution {
    public int[] plusOne(int[] digits) {

        // Traverse from the last digit
        for (int i = digits.length - 1; i >= 0; i--) {

            // If the current digit is less than 9
            if (digits[i] < 9) {
                digits[i]++;      // Add 1
                return digits;    // Return the updated array
            }

            // If the current digit is 9, make it 0 and continue
            digits[i] = 0;
        }

        // If all digits were 9, create a new array
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;

        return ans;
    }
}