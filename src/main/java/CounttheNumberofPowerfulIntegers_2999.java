class Solution {
    private String suffix;
    private int limit;
    private Long[][] memo;

    public long numberOfPowerfulInt(long start, long finish, int limit, String suffix) {
        this.suffix = suffix;
        this.limit = limit;
        return count(finish) - count(start - 1);
    }

    private long count(long num) {
        if (num < Long.parseLong(suffix)) return 0;
        String s = Long.toString(num);
        memo = new Long[s.length()][2];
        return dfs(0, true, s);
    }

    private long dfs(int i, boolean tight, String num) {
        if (i == num.length()) return 1;
        if (memo[i][tight ? 1 : 0] != null) return memo[i][tight ? 1 : 0];

        long res = 0;
        int maxDigit = tight ? num.charAt(i) - '0' : 9;
        int sufStart = num.length() - suffix.length();

        if (i >= sufStart) {
            int d = suffix.charAt(i - sufStart) - '0';
            if (d <= maxDigit && d <= limit)
                res += dfs(i + 1, tight && d == maxDigit, num);
        } else {
            for (int d = 0; d <= Math.min(maxDigit, limit); d++) {
                res += dfs(i + 1, tight && d == maxDigit, num);
            }
        }

        return memo[i][tight ? 1 : 0] = res;
    }
}
