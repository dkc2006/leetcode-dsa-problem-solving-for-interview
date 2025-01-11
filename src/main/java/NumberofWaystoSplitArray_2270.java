class Solution {
    public int waysToSplitArray(int[] nums) {
        long total = 0;
        long left = 0;
        for (int num : nums) {
            total += num;
        }
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            left += nums[i];
            if (2*left >= total) {
                count++;
            }
        }
        return count;
    }
}