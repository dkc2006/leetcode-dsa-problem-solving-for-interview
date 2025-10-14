import java.util.*;

class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums)
            list.add(num);

        int ops = 0;
        while (true) {

            boolean sorted = true;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i - 1) > list.get(i)) {
                    sorted = false;
                    break;
                }
            }
            if (sorted)
                return ops;


            int idx = 0;
            int minSum = Integer.MAX_VALUE;
            for (int i = 1; i < list.size(); i++) {
                int s = list.get(i - 1) + list.get(i);
                if (s < minSum) {
                    minSum = s;
                    idx = i;
                }
            }


            list.set(idx - 1, minSum);
            list.remove(idx);
            ops++;
        }
    }
}