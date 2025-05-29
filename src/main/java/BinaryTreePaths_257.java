class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null)
            return result;
        backtrack(root, result, "");
        return result;
    }

    public void backtrack(TreeNode root, List<String> r, String s) {
        if (root == null)
            return;
        s = s + Integer.toString(root.val);
        if (root.left == null && root.right == null) {
            r.add(s);
        }
        s += "->";
        backtrack(root.left, r, s);
        backtrack(root.right, r, s);
    }
}