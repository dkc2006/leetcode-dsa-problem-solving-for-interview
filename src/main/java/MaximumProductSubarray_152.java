class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] < 0) {
                // Swap max and min when encountering a negative number
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            maxProd = Math.max(nums[i], maxProd * nums[i]);
            minProd = Math.min(nums[i], minProd * nums[i]);

            result = Math.max(result, maxProd);
        }
        return result;
    }
}
