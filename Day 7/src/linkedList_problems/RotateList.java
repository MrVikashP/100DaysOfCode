package linkedList_problems;

// https://leetcode.com/problems/rotate-list/description/
public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(k == 0 || head == null || head.next == null){
            return head;
        }

        ListNode last = head;
        int len = 1;

        while (last.next != null) {
            last = last.next;
            len++;
        }

        last.next = head;
        len = len - k % len;

        ListNode newLast = head;
        for (int i = 0; i < len - 1; i++) {
            newLast = newLast.next;
        }

        head = newLast.next;
        newLast.next = null;

        return head;

    }

    private class ListNode {
        int val;
        ListNode next;
    }
}
