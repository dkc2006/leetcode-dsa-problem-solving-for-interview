
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int incresing = 1, decresing = 1;
        int longest = 1;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] < nums[i]) {
                incresing++;
                decresing = 1;
            } else if (nums[i - 1] > nums[i]) {
                decresing++;
                incresing = 1;
            } else {
                incresing = 1;
                decresing = 1;
            }
            longest = Math.max(longest, Math.max(incresing, decresing));

        }
        return longest;
    }
}