class Solution {
    public long countGood(int[] nums, int k) {
        int n = nums.length, same = 0, j = 0;
        long good = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            while (same < k && j < n) {
                same += map.getOrDefault(nums[j], 0);
                map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
                j++;
            }
            if (same >= k) good += n - (j - 1);
            map.put(nums[i], map.get(nums[i]) - 1);
            same -= map.get(nums[i]);
        }
        return good;
    }
}
