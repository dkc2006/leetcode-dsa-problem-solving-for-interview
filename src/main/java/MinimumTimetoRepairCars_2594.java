import java.util.Arrays;
class Solution {
    public long repairCars(int[] ranks, int cars) {
        Arrays.sort(ranks);
        long left = 1, right = (long) ranks[0] * (long) cars * cars;
        long answer = right;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (canRepairAll(ranks, cars, mid)) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }
    private boolean canRepairAll(int[] ranks, int cars, long maxTime) {
        long repaired = 0;
        for (int r : ranks) {
            repaired += (long) Math.sqrt(maxTime / r);
            if (repaired >= cars) return true;
        }
        return false;
    }
}
