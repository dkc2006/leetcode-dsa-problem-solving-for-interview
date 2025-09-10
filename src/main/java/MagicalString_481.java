class Solution {
    public int magicalString(int n) {
        StringBuilder sb= new StringBuilder("122");
        int w=2;
        char r='1';
        while(sb.length()<n){
            String repeat1= String.valueOf(r).repeat(sb.charAt(w)-'0');
            sb.append(repeat1);
            w++;
            if(r=='1') r='2';
            else r='1';
        }
        int cnt=0;
        for(int i=0;i<n;++i){
            if(sb.charAt(i)=='1') cnt++;
        }
        return cnt;
    }
}