class Solution {
    public void duplicateZeros(int[] arr) {

        int[] temp = new int[arr.length];

        int i = 0;
        int j = 0;

        while (i < arr.length && j < arr.length) {

            if (arr[i] == 0) {
                temp[j] = 0;
                j++;

                if (j < arr.length) {
                    temp[j] = 0;
                    j++;
                }
            } else {
                temp[j] = arr[i];
                j++;
            }

            i++;
        }

        for (i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }
}