package linkedList_problems;
// https://leetcode.com/problems/linked-list-cycle/description/
public class IsCyclic {

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow){
                return true;
            }
        }
        return false;
    }

    public int cycleLenght(ListNode head) {
        int count = 0;
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow){
                do {
                    count++;
                    slow = slow.next;
                }while (slow != fast);
            }
        }
        return count;
    }
    public class ListNode {
        int val;
        ListNode next;
    }
}
