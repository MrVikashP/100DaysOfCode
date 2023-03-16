package linkedList_problems;

public class PalindromeList {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode midNode = getMid(head);

        ListNode prev = null;
        ListNode curr = midNode;
        ListNode next;

        // reversing the values from mid to last
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode right = prev;
        ListNode left = head;

        // comparing values
        while (right != null) {
            if (left.val != right.val){
                return false;
            }

            right = right.next;
            left = left.next;
        }

        return true;

    }

    private ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    private class ListNode {
        int val;
        ListNode next;
    }
}
