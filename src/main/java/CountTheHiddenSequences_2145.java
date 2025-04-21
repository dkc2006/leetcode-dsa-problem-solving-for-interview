class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long sum = 0;
        long mini = 0, maxi = 0;

        for (int diff : differences) {
            sum += diff;
            mini = Math.min(mini, sum);
            maxi = Math.max(maxi, sum);
        }

        long validLow = lower - mini;
        long validHigh = upper - maxi;

        return (int)Math.max(0, validHigh - validLow + 1);
    }
}