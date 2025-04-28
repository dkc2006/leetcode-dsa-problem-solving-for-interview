class Solution {
    public long countSubarrays(int[] nums, long k) {
        long res = 0, partSum = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            partSum += nums[i];
            while (j <= i && partSum * (i - j + 1) >= k) {
                partSum -= nums[j++];
            }
            res += i - j + 1;
        }
        return res;
    }
}
