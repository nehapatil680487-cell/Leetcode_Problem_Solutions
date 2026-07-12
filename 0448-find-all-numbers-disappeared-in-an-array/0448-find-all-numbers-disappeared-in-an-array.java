import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();

        // Store all numbers
        for (int num : nums) {
            set.add(num);
        }

        // Check numbers from 1 to n
        for (int i = 1; i <= nums.length; i++) {

            if (!set.contains(i)) {
                ans.add(i);
            }
        }

        return ans;
    }
}