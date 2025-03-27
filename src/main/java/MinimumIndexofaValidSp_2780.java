import java.util.*;

class Solution {
    public int minimumIndex(List<Integer> nums) {
        int candidate = 0, count = 0, total = 0, leftCount = 0, n = nums.size();

        for (int num : nums) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }

        for (int num : nums) if (num == candidate) total++;

        if (total * 2 <= n) return -1;

        for (int i = 0; i < n; i++) {
            if (nums.get(i) == candidate) leftCount++;
            if (leftCount * 2 > (i + 1) && (total - leftCount) * 2 > (n - i - 1))
                return i;
        }
        return -1;
    }
}
