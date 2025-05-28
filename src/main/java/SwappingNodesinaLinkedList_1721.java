class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head, fast = head;
        ListNode start = head, end = head;
        for (int i = 1; i < k; i++) {
            fast = fast.next;
        }
        start = fast;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        end = slow;
        int temp = start.val;
        start.val = end.val;
        end.val = temp;
        return head;
    }
}