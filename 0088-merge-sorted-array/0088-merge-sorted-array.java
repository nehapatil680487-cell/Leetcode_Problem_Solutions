class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // Pointer for the last valid element in nums1
        int i = m - 1;

        // Pointer for the last element in nums2
        int j = n - 1;

        // Pointer for the last position in nums1
        int k = m + n - 1;

        // Compare elements from the end and place the larger one
        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }

        // Copy any remaining elements from nums2
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}