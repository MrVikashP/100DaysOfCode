package linkedList_problems;
// https://leetcode.com/problems/linked-list-cycle-ii/description/
public class CyclicNode {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        boolean isCycle = false;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                isCycle = true;
                break;
            }
        }

        if (!isCycle) {
            return null;
        }

        slow = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public class ListNode {
        int val;
        ListNode next;
    }
}
