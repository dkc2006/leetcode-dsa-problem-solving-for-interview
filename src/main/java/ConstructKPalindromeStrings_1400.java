class Solution {
    public boolean canConstruct(String s, int k) {
        int n = s.length();
        if (k > n) {
            return false;
        }
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        int n2 = ch.length;
        int oddChar = 0;

        for (int i = 0; i < n2; i++) {
            char cur = ch[i];
            int c = 0;
            while(i<n2 && ch[i] == cur){
                c++;
                i++;
            }
            if(c%2!=0){
                oddChar++;
            }
            i--;
        }
        return oddChar<=k;
    }
}