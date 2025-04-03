class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxTripletValue = 0, maxDiff = Long.MIN_VALUE;
        int maxI = nums[0];

        for (int j = 1; j < nums.length - 1; j++) {
            maxDiff = Math.max(maxDiff, maxI - (long) nums[j]);
            maxI = Math.max(maxI, nums[j]);
            maxTripletValue = Math.max(maxTripletValue, maxDiff * nums[j + 1]);
        }
        return maxTripletValue;
    }
}