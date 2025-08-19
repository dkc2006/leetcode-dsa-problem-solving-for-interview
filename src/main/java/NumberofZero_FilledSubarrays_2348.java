class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long sum = 0;
        long count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
                sum += count;
            } else {
                count = 0;
            }
        }
        return sum;
    }
}