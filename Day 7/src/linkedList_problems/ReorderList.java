package linkedList_problems;

// https://leetcode.com/problems/reorder-list/
public class ReorderList {
    public void reorderList(ListNode head) {
        // take first node and last node respectively and then increase the first and decrease the last.
        if (head == null || head.next == null) {
            return;
        }

        ListNode middle = getMiddle(head);
        ListNode hs = reverse(middle);
        ListNode hf = head;

        // rearranging the nodes accordingly
        while (hf != null && hs != null) {
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;

        }

        if (hf != null) {
            hf.next = null;
        }
    }

    // get middle node
    private ListNode getMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private ListNode reverse(ListNode head) {
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
    private class ListNode {
        int val;
        ListNode next;
    }
}
