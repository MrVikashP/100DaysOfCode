package linkedList_problems;

// https://leetcode.com/problems/reverse-nodes-in-k-group/description/
public class ReorderInKGroup {
    private int length(ListNode head){
        ListNode curr = head;
        int len = 0;
        while(curr != null){
            curr = curr.next;
            len++;
        }
        return len;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1 || head == null) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;

        while (true) {
            ListNode last = prev;
            ListNode newEnd = curr;
            int len = length(newEnd);
            if (len < k) {
                break;
            }

            for (int i = 0; curr != null && i < k; i++) {
                curr.next = prev;
                prev = curr;
                curr = next;

                if (next != null) {
                    next = next.next;
                }
            }
            if (last != null) {
                last.next = prev;
            }
            else {
                head = prev;
            }

            newEnd.next = curr;

            if (curr == null) {
                break;
            }

            prev = newEnd;

        }
        return head;
    }

    private class ListNode {
        int val;
        ListNode next;
    }
}
