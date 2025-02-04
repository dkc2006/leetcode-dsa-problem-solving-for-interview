class Solution {
    public int[] leftRightDifference(int[] nums){
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int leftSum = 0;
            int rightSum = 0;
            int left = 0;
            int right = nums.length-1;

            while(left < i || right > i){
                if(left < i){
                    leftSum += nums[left++];
                }
                if(right > i){
                    rightSum += nums[right--];
                }
            }
            ans[i] = Math.abs(leftSum-rightSum);
        }
        return ans;
    }

}