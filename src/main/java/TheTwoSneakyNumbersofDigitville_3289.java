class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        List<Integer> ls = new ArrayList<>();

        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                ls.add(nums[i]);
                i++;
            }
        }
        int [] res = new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            res[i] = ls.get(i);
        }
        return res;
    }
}