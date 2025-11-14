class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        int dp[] = new int[m+1];

        for(int i=0; i<m+1; i++) dp[i] = i;

        for(int i=1; i<n+1; i++) {
            int prevDiag = i-1;
            dp[0] = i;
            for(int j=1; j<m+1; j++) {
                int prevTop = dp[j];
                if(word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[j] = prevDiag;
                } else {
                    dp[j] = Math.min(dp[j], Math.min(dp[j-1], prevDiag)) + 1;
                }
                prevDiag = prevTop;
            }
        }

        return dp[m];
    }
}