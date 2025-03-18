class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int maxlen = 1;
        int left = 0;
        int usedBit = 0;
        for (int i = 0; i < n; i++) {
            while ((usedBit & nums[i]) != 0) {
                usedBit ^= nums[left];
                left++;
            }
            usedBit |= nums[i];
            maxlen = Math.max(maxlen, i - left + 1);
        }
        return maxlen;
    }
}