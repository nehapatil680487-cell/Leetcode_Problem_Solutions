class Solution {
    public int[] leftRightDifference(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Find total sum
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        // Step 2: Calculate left and right sums
        int leftSum = 0;

        for (int i = 0; i < n; i++) {

            int rightSum = totalSum - leftSum - nums[i];

            result[i] = Math.abs(leftSum - rightSum);

            leftSum += nums[i];
        }

        return result;
    }
}