class Solution {
    public int minimumOperations(int[] nums) {
        boolean[] vis = new boolean[128];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (vis[nums[i]]) {
                return i / 3 + 1;
            }
            vis[nums[i]] = true;
        }
        return 0;
    }
}