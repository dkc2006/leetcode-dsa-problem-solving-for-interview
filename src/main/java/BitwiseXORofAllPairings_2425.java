class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int counter = 0;
        if (n % 2 == 1) {
            for (int i = 0; i < m; i++) {
                counter ^= nums2[i];
            }
        }
        if (m % 2 == 1) {
            for (int i = 0; i < n; i++) {
                counter ^= nums1[i];
            }
        }
        return counter;

    }
}