import java.util.Arrays;

class Solution {
    public int findLucky(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        Arrays.sort(arr);
        int maxFreq = 1, currentFreq = 1;
        int maxElement = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currentFreq++;
            } else {
                if (arr[i - 1] == currentFreq) {
                    maxElement = Math.max(maxElement, arr[i - 1]);
                }
                currentFreq = 1;
            }
        }

        if (arr[arr.length - 1] == currentFreq) {
            maxElement = Math.max(maxElement, arr[arr.length - 1]);
        }

        return maxElement;
    }
}
