// class Solution {
//   public boolean check(int[] nums) {
//         int n = nums.length;
//         int count = 0;

//         // Count the number of times the order is violated.
//         for (int i = 0; i < n; i++) {
//             if (nums[i] > nums[(i + 1) % n]) {
//                 count++;
//             }
//         }

//         // The array is a rotated sorted array if there is at most one order violation.
//         return count <= 1;
//     }
// }

class Solution {
    public boolean check(int[] nums) {
        int count=0;
        if (nums[0] < nums[nums.length - 1]) {
            count++;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
            }
            if(count>1){
                return false;
            }
        }
        return true;
    }
}