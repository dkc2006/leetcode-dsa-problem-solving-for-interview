import java.util.*;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, max = 0, last = -1;
        int[] dp = new int[n], prev = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);

        for (int i = 0; i < n; i++)
            for (int j = 0; j < i; j++)
                if (nums[i] % nums[j] == 0 && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }

        for (int i = 0; i < n; i++)
            if (dp[i] > max) {
                max = dp[i];
                last = i;
            }

        List<Integer> res = new ArrayList<>();
        while (last != -1) {
            res.add(nums[last]);
            last = prev[last];
        }
        Collections.reverse(res);
        return res;
    }
}
