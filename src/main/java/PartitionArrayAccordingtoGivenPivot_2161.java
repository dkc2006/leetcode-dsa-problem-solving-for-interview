class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int lCount = 0, pCount = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot) lCount++;
            else if (nums[i] == pivot) pCount++;
        }
        int[] res = new int[n];
        int left = 0, mid = lCount, right = lCount + pCount;
        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot) res[left++] = nums[i];
            else if (nums[i] > pivot) res[right++] = nums[i];
            else res[mid++] = nums[i];
        }
        return res;
    }
}
