class Solution {
    public int maximumCount(int[] nums) {
        int count = 0;
        int count2 = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                count++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                count2++;
            }
        }
        return Math.max(count, count2);
    }
}