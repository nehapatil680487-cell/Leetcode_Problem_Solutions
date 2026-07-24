class Solution {
    public String reverseWords(String s) {

        char[] arr = s.toCharArray();

        int start = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == ' ') {

                int left = start;
                int right = i - 1;

                while (left < right) {

                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;

                    left++;
                    right--;
                }

                start = i + 1;
            }
        }

        // Reverse the last word
        int left = start;
        int right = arr.length - 1;

        while (left < right) {

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }
}