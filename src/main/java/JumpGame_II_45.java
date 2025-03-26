class Solution {
    public int jump(int[] nums) {
        int jumps = 0, curr = 0, fast = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            fast = Math.max(fast, i + nums[i]);
            if (i == curr) {
                jumps++;
                curr = fast;
            }
        }
        return jumps;
    }
}