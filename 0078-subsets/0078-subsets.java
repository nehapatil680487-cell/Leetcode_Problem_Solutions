class Solution {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        backtrack(0, nums, new ArrayList<>(), ans);

        return ans;
    }

    public void backtrack(int index, int[] nums,
                          List<Integer> current,
                          List<List<Integer>> ans) {

        if (index == nums.length) {

            ans.add(new ArrayList<>(current));
            return;
        }

        // Include current element
        current.add(nums[index]);
        backtrack(index + 1, nums, current, ans);

        // Backtrack
        current.remove(current.size() - 1);

        // Exclude current element
        backtrack(index + 1, nums, current, ans);
    }
}