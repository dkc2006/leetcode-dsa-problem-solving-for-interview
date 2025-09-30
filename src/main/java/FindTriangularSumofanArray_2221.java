class Solution {
    public int triangularSum(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        for(int num:nums) ls.add(num);
        while(ls.size()!=1){
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<ls.size()-1;i++){
                int val = (ls.get(i) + ls.get(i+1))%10;
                temp.add(val);
            }
            ls = temp;
        }
        return ls.get(0);
    }
}