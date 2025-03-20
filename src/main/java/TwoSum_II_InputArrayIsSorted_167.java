class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int total = nums[left] + nums[right];

            if (total == target) {
                return new int[] { left + 1, right + 1 };
            }
            if (total < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] { -1, -1 };

    }
}
