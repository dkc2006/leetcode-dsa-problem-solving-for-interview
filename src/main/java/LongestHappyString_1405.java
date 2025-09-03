class Solution {
    public String longestDiverseString(int a, int b, int c) {
        int countA = 0, countB = 0, countC = 0;
        StringBuilder result = new StringBuilder();
        int total = a + b + c;

        for (int i = 0; i < total; i++) {
            if ((a >= b && a >= c && countA != 2) || (a > 0 && (countB == 2 || countC == 2))) {
                result.append('a'); a--; countA++; countB = 0; countC = 0;
            } else if ((b >= a && b >= c && countB != 2) || (b > 0 && (countA == 2 || countC == 2))) {
                result.append('b'); b--; countB++; countA = 0; countC = 0;
            } else if ((c >= a && c >= b && countC != 2) || (c > 0 && (countA == 2 || countB == 2))) {
                result.append('c'); c--; countC++; countA = 0; countB = 0;
            } else {
                break;
            }
        }

        return result.toString();
    }
}
