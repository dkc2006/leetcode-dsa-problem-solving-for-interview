class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int rev = 26 - (c - 'a');
            int index = i + 1;
            ans += rev * index;
        }
        return ans;
    }
}