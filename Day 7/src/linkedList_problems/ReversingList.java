package linkedList_problems;
// reverse method solves this
// https://leetcode.com/problems/reverse-linked-list/description/

// reverse2 method solves this
// https://leetcode.com/problems/reverse-linked-list-ii/description/

public class ReversingList {
    // leetcode solution
    public ListNode reverse(ListNode head) {
        if (head == null && head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;

        while (curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;

            if (next != null){
                next = next.next;
            }
        }
        return prev;
    }
    public ListNode reverse2(ListNode head, int left, int right) {
        // leetcode solution
        if (left == right) {
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;

        for (int i = 0; curr != null && i < left - 1; i++) {
            prev = curr;
            curr = curr.next;
        }

        ListNode first = prev;
        ListNode second = curr;

        ListNode next = curr.next;

        for (int i = 0; i <= right - left; i++) {
            curr.next = prev;
            prev = curr;
            curr = next;

            if (next != null) {
                next = next.next;
            }
        }

        if (first != null) {
            first.next = prev;
        }
        else head = prev;

        second.next = curr;

        return head;

    }
    private ListNode head;
    private ListNode tail;
    public void reverseList (ListNode node) {
        if (node == tail) {
            head = node;
            return;
        }

        reverseList(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
    private class ListNode {
        int val;
        ListNode next;

    }

}
