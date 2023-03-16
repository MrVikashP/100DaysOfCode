package linkedList_problems;

public class ReverseInKAlternative {
    private int length(ListNode head){
        ListNode curr = head;
        int len = 0;
        while(curr != null){
            curr = curr.next;
            len++;
        }
        return len;
    }
    public ListNode reverseKAlternative(ListNode head, int k) {
        if (k == 1 || head == null) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;

        while (curr != null) {
            ListNode last = prev;
            ListNode newEnd = curr;
            int len = length(newEnd);

            for (int i = 0; len >= k && curr != null && i < k; i++) {
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

            // skip the k nodes
            for (int i = 0; curr != null && i < k; i++) {
                prev = curr;
                curr = curr.next;
            }

        }
        return head;
    }

    private class ListNode {
        int val;
        ListNode next;
    }
}
