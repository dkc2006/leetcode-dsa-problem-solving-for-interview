class Solution {
    public String makeGood(String s) {
        char c[] = s.toCharArray();
        int j=0;
        for(int i=0;i<c.length;i++){
            if(j>0 && (c[i]^c[j-1])==32) j--;
            else c[j++] = c[i];
        }
        return new String(c,0,j);
    }
}