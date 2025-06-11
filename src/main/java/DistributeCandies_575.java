class Solution {
    public int distributeCandies(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int n = set.size();
        int m = nums.length/2 ;
        return n>m? m:n;
    }
}