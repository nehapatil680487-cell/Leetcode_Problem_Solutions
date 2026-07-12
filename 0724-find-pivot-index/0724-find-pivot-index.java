class Solution {
    public int pivotIndex(int[] nums) {

        int totalSum = 0;

        // Calculate total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

            // Calculate right sum
            int rightSum = totalSum - leftSum - nums[i];

            // Check if current index is the pivot
            if (leftSum == rightSum) {
                return i;
            }

            // Update left sum
            leftSum += nums[i];
        }

        // No pivot index found
        return -1;
    }
}