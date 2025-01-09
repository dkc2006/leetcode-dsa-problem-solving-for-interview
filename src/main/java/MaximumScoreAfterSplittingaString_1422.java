class Solution {
    public int maxScore(String s) {
        int length = s.length();
        int ones = 0;
        for(int i=0;i<length;i++){
            if(s.charAt(i) == '1') ones++;
        }
        // find max partition
        int res = 0;
        int zeros = 0;
        for(int i=0;i<length-1;i++){
            if(s.charAt(i) == '0')  zeros++;
            else ones--;
            res = Math.max(res,ones+zeros);
        }
        return res;
    }
}