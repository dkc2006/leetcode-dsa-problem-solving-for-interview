public class Solution {
    int min = Integer.MAX_VALUE;
    Integer prev = null;

    public int getMinimumDifference(TreeNode root) {

        if (root == null) return min;

        getMinimumDifference(root.left);

        if (prev != null) min = Math.min(min, root.val - prev);
        prev = root.val;

        getMinimumDifference(root.right);

        return min;
    }

}