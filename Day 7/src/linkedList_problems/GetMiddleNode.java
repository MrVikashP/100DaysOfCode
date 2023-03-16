package linkedList_problems;
// https://leetcode.com/problems/middle-of-the-linked-list/
public class GetMiddleNode {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
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
