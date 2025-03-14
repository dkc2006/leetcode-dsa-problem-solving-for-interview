import java.util.Arrays;
class Solution {
    public int maximumCandies(int[] arr, long k) {
        Arrays.sort(arr);
        int left = 1, right = arr[arr.length - 1], result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canDistribute(arr, mid, k)) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
    private boolean canDistribute(int[] arr, int candies, long k) {
        long count = 0;
        for (int num : arr) count += num / candies;
        return count >= k;
    }
}
