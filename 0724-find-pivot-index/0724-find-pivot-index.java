class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum=0;

        for(int num:nums){
            totalsum = totalsum + num;
        }
        int leftsum=0;

        for(int i=0;i<nums.length;i++){
            int rightsum = totalsum - leftsum - nums[i];
        

        if(leftsum == rightsum){
            return i;
        }else{
            leftsum = leftsum + nums[i];
        }
        }
        return -1;

        
    }
}