/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int preIndex = 0;
    private int postIndex = 0;

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return buildTree(preorder, postorder);
    }
    private TreeNode buildTree(int[] preorder, int[] postorder) {
        TreeNode node = new TreeNode(preorder[preIndex++]);

        if (node.val != postorder[postIndex]) {
            node.left = buildTree(preorder, postorder);
        }

        if (node.val != postorder[postIndex]) {
            node.right = buildTree(preorder, postorder);
        }

        postIndex++;
        return node;
    }
}