import java.util.*;

class Solution {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        backtrack(0, nums, new ArrayList<>(), ans);

        return ans;
    }

    public void backtrack(int index, int[] nums,
                          List<Integer> current,
                          List<List<Integer>> ans) {

        // Store current subset
        ans.add(new ArrayList<>(current));

        // Try every remaining element
        for (int i = index; i < nums.length; i++) {

            // Choose
            current.add(nums[i]);

            // Explore
            backtrack(i + 1, nums, current, ans);

            // Unchoose (Backtrack)
            current.remove(current.size() - 1);
        }
    }
}