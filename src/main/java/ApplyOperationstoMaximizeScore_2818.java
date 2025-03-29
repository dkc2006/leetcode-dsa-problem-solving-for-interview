import java.util.*;

class Solution {
    private static final int MOD = 1_000_000_007;

    public int maximumScore(List<Integer> nums, int k) {
        int n = nums.size(), mx = Collections.max(nums), ans = 1;
        int[] minPrime = sieve(mx), scores = getPrimeScores(nums, minPrime);
        int[] left = new int[n], right = new int[n];
        Arrays.fill(left, -1); Arrays.fill(right, n);
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = n - 1; i >= 0; --i) {
            while (!stack.isEmpty() && scores[stack.peek()] <= scores[i]) left[stack.pop()] = i;
            stack.push(i);
        }

        stack.clear();
        for (int i = 0; i < n; ++i) {
            while (!stack.isEmpty() && scores[stack.peek()] < scores[i]) right[stack.pop()] = i;
            stack.push(i);
        }

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; ++i) arr[i] = new int[]{nums.get(i), i};

        Arrays.sort(arr, (a, b) -> b[0] == a[0] ? a[1] - b[1] : b[0] - a[0]);

        for (int[] p : arr) {
            long count = (long) (p[1] - left[p[1]]) * (right[p[1]] - p[1]);
            long use = Math.min(count, k);
            k -= use;
            ans = (int) ((1L * ans * modPow(p[0], use)) % MOD);
            if (k == 0) break;
        }
        return ans;
    }

    private int[] sieve(int n) {
        int[] minPrime = new int[n + 1];
        for (int i = 2; i <= n; ++i) minPrime[i] = i;
        for (int i = 2; i * i <= n; ++i)
            if (minPrime[i] == i) for (int j = i * i; j <= n; j += i) minPrime[j] = Math.min(minPrime[j], i);
        return minPrime;
    }

    private int[] getPrimeScores(List<Integer> nums, int[] minPrime) {
        int[] scores = new int[nums.size()];
        for (int i = 0; i < nums.size(); ++i) scores[i] = getPrimeScore(nums.get(i), minPrime);
        return scores;
    }

    private int getPrimeScore(int num, int[] minPrime) {
        Set<Integer> factors = new HashSet<>();
        while (num > 1) {
            factors.add(minPrime[num]);
            num /= minPrime[num];
        }
        return factors.size();
    }

    private long modPow(long x, long n) {
        long res = 1;
        while (n > 0) {
            if (n % 2 == 1) res = (res * x) % MOD;
            x = (x * x) % MOD;
            n /= 2;
        }
        return res;
    }
}
