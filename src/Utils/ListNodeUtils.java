package Utils;

import beans.ListNode;

public class ListNodeUtils {
    public static ListNode arrayToListNode(int[] array) {
        if(array.length == 0) return null;
        ListNode head = new ListNode(array[0]);
        ListNode pre = head;
        for(int i = 1; i < array.length; i++) {
            ListNode temp = new ListNode(array[i]);
            pre.next = temp;
            pre = temp;
        }
        return head;
    }
}
