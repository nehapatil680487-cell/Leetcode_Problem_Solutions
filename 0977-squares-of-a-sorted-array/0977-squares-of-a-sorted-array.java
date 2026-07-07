class Solution {
    public int[] sortedSquares(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;

        int[] ans = new int[nums.length];

        while (left <= right) {

            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                ans[index] = leftSquare;
                left++;
            } else {
                ans[index] = rightSquare;
                right--;
            }

            index--;
        }

        return ans;
    }
}