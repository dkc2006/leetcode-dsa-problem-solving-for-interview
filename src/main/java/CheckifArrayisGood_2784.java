class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int max = nums.length - 1;
        int[] arr = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        arr[arr.length - 1] = max;
        return Arrays.equals(nums, arr);
    }
}