class Solution {
    public String getHappyString(int n, int k) {
        List<String> happyStrings = new ArrayList<>();
        generateHappyStrings("", n, happyStrings);
        if (k > happyStrings.size()) {
            return "";
        }
        return happyStrings.get(k - 1);
    }
    private void generateHappyStrings(String current, int n, List<String> happyStrings) {
        if (current.length() == n) {
            happyStrings.add(current);
            return;
        }
        for (char ch = 'a'; ch <= 'c'; ch++) {
            if (current.length() == 0 || current.charAt(current.length() - 1) != ch) {
                generateHappyStrings(current + ch, n, happyStrings);
            }
        }
    }
}