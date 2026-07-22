class Solution {
    public int findDuplicate(int[] nums) {

        // Both start from the first element
        int slow = nums[0];
        int fast = nums[0];

        // Phase 1: Detect the cycle
        do {
            // Slow moves 1 step
            slow = nums[slow];

            // Fast moves 2 steps
            fast = nums[nums[fast]];

        } while (slow != fast);


        // Phase 2: Find the duplicate number
        slow = nums[0];

        while (slow != fast) {

            // Both move 1 step
            slow = nums[slow];
            fast = nums[fast];
        }

        // The meeting point is the duplicate
        return slow;
    }
}