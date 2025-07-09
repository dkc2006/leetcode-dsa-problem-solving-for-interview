class Solution {
    public List<String> letterCombinations(String digits) {
        String[] map = new String[10];
        map[2] = "abc";
        map[3] = "def";
        map[4] = "ghi";
        map[5] = "jkl";
        map[6] = "mno";
        map[7] = "pqrs";
        map[8] = "tuv";
        map[9] = "wxyz";

        List<String> result = new ArrayList<>();
        if (digits.length() == 0) return result;
        StringBuilder sb = new StringBuilder();
        sol(digits, map, result, 0, sb);
        return result;
    }

    private void sol(String digits, String[] map, List<String> result, int idx, StringBuilder sb) {
        if (idx == digits.length()) {
            result.add(sb.toString());
            return;
        }

        String letters = map[digits.charAt(idx) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            sb.append(letters.charAt(i));
            sol(digits, map, result, idx + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}