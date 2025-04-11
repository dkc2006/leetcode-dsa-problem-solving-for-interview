class Solution {
    public static boolean isSymmetric(String s) {
        int sum = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            sum += (int) s.charAt(i);
        }
        int sum2 = 0;
        for (int i = s.length() / 2; i < s.length(); i++) {
            sum2 += (int) s.charAt(i);
        }
        return sum == sum2;
    }

    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            String a = String.valueOf(i);
            if (a.length() % 2 == 0) {
                if (isSymmetric(a)) {
                    count++;
                }
            }
        }
        return count;
    }
}