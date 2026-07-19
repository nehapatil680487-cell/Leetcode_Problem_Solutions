class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> ans = new ArrayList<>();

        int right = num.length - 1;
        int carry = 0;

        while (right >= 0 || k > 0 || carry > 0) {

            int digitFromArray = 0;

            if (right >= 0) {
                digitFromArray = num[right];
            }

            int digitFromK = k % 10;

            int sum = digitFromArray + digitFromK + carry;

            ans.add(0, sum % 10);

            carry = sum / 10;

            k = k / 10;

            right--;
        }

        return ans;
    }
}