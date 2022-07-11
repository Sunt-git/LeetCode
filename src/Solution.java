import Utils.ListNodeUtils;
import beans.ListNode;

import java.util.List;

class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        ListNode dummy = new ListNode(0, head);
        ListNode left = head, right = head.next;
        ListNode pre = dummy;
        while(left != null && right != null) {
            ListNode temp = right.next;
            right.next = left;
            pre.next = right;
            pre = left;
            left = temp;
            right = temp == null ? null : temp.next;
        }
        if(left != null) {
            pre.next = left;
        } else {
            pre.next = null;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        int[] inputArray = new int[]{1,2,3,4};
        ListNode input = ListNodeUtils.arrayToListNode(inputArray);
        Solution solution = new Solution();
        solution.swapPairs(input);
    }
}