class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String res = countAndSay(n-1);
        StringBuilder sb = new StringBuilder();
        int curr= 0;
        char ch = res.charAt(0);
        for(char ch2 : res.toCharArray()){
            if(ch==ch2) curr++;
            else {
                sb.append(curr).append(ch);
                ch = ch2;
                curr= 1;
            }
        }
        sb.append(curr).append(ch);
        return sb.toString();
    }
}