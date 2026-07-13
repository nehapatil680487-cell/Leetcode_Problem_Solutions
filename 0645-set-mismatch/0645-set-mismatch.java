import java.util.HashSet;

class Solution {
    public int[] findErrorNums(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        int duplicate = 0;
        int missing = 0;

        // Find duplicate
        for (int num : nums) {

            if (set.contains(num)) {
                duplicate = num;
            }

            set.add(num);
        }

        // Find missing
        for (int i = 1; i <= nums.length; i++) {

            if (!set.contains(i)) {
                missing = i;
                break;
            }
        }

        return new int[]{duplicate, missing};
    }
}