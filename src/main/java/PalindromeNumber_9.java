class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder();
        String s = Integer.toString(x);
        sb.append(s);
        sb.reverse();
        return s.equals(sb.toString());
    }
}
