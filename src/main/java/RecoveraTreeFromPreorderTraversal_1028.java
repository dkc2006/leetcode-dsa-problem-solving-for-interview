import java.util.*;
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

class Solution {
    public TreeNode recoverFromPreorder(String s) {
        Stack<TreeNode> stack = new Stack<>();
        int i = 0;

        while (i < s.length()) {
            int depth = 0, val = 0;
            while (i < s.length() && s.charAt(i) == '-') { depth++; i++; }
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                val = val * 10 + (s.charAt(i++) - '0');
            }

            TreeNode node = new TreeNode(val);
            while (stack.size() > depth) stack.pop();
            if (!stack.isEmpty()) {
                if (stack.peek().left == null) stack.peek().left = node;
                else stack.peek().right = node;
            }
            stack.push(node);
        }
        while (stack.size() > 1) stack.pop();
        return stack.peek();
    }
}
