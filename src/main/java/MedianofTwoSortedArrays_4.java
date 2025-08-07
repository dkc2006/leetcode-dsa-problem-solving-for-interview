class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            li.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            li.add(arr2[i]);
        }
        Collections.sort(li);
        int len = li.size();
        if (len % 2 == 1) {
            int mid = len / 2;
            return (double) (li.get(mid));
        }
        int mid = len / 2;
        int mid2 = mid - 1;
        int a = li.get(mid);
        int b = li.get(mid2);
        return (double)(a + b) / 2;
    }
}